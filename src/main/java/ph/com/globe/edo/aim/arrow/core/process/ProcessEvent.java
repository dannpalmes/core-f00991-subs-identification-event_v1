package ph.com.globe.edo.aim.arrow.core.process;

import static ph.com.globe.edo.aim.arrow.core.constants.SubsCacheEventConstants.*;
import static ph.com.globe.edo.aim.steps.component.utility.StepsFormatter.formatMsisdn;

import java.util.Arrays;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.apache.commons.lang.RandomStringUtils;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import lombok.extern.slf4j.Slf4j;
import ph.com.globe.edo.aim.arrow.aerospike.service.AerospikeService;
import ph.com.globe.edo.aim.arrow.core.dto.SubsIdentification;
import ph.com.globe.edo.aim.arrow.core.dto.SubsIdentificationEvent;
import ph.com.globe.edo.aim.arrow.kafka.producer.client.KafkaProducerClient;

@Slf4j
@Dependent
public class ProcessEvent {

//	@ConfigProperty(name = "filter.registration.opid")
//	String[] regOpId;

//	@ConfigProperty(name = "filter.extension.opid")
//	String[] extOpId;
//
//	@ConfigProperty(name = "filter.deprovision.opid")
//	String[] depOpId;
	@ConfigProperty(name = "filter.valid.error.codes", defaultValue = "0")
	String[] errorCode;
	@ConfigProperty(name = "is.send-to-kafka", defaultValue = "true")
	boolean isSendToKafka;
	@ConfigProperty(name = "is.process-event", defaultValue = "true")
	boolean isProcessEvent;
	@ConfigProperty(name = "kafka.producer.delimeter", defaultValue = "\t")
	String producerDelimeter;
	@Inject
	KafkaProducerClient kafkaProducerEventClient;
	@Inject
	AerospikeService aerospikeService;
	public void processEventSubs(SubsIdentification data, String topic, String produceTopic) {
		log.info("topic: {} - data: {}", topic, data);
		data.setMsisdn(formatMsisdn(data.getMsisdn().toString()));
		String msisdn = data.getMsisdn().toString();
		try{
			if(dataExistsOnUUP(data.getMsisdn().toString())){
				if (isProcessEvent) {
					if (Arrays.asList(errorCode).contains(data.getErrCode().toString())) {
						SubsIdentificationEvent siCache = new SubsIdentificationEvent();
						siCache = buildSubsIdentificationWrapper(data, topic);
						sendToKafka(writeAsString(siCache), produceTopic);
					} else {
						log.info("Error Code Invalid: {} {}", errorCode, msisdn);
					}
				}
			}
		} catch (Exception e){
			log.error("Error in Si Cache Events: {}", e.getMessage());
		}
	}
	private Boolean dataExistsOnUUP(String primaryKey){
		if((!aerospikeService.retrieve("steps","uup_cache",primaryKey,MSISDN_BIN,IMSI_BIN).isEmpty())){
			return true;
		};
		return false;
	}
	public String detectionId(String primaryKey){
		//return String.valueOf(aerospikeService.retrieve("","uup_cache",primaryKey,MSISDN_BIN,IMSI_BIN).hashCode());
		return RandomStringUtils.randomAlphanumeric(4);
	}
	private SubsIdentificationEvent buildSubsIdentificationWrapper(SubsIdentification subsIdentification, String sourceTopic) {

		SubsIdentificationEvent subsIdentificationCache = new SubsIdentificationEvent();

		try {
			subsIdentificationCache.setDetectionId(detectionId(subsIdentification.getMsisdn().toString()));
			subsIdentificationCache.setMsisdn(subsIdentification.getMsisdn().toString());
			subsIdentificationCache.setImsi(subsIdentification.getImsi().toString());
			subsIdentificationCache.setBrand(subsIdentification.getBrand().toString());
			subsIdentificationCache.setFName(subsIdentification.getFName().toString());
			subsIdentificationCache.setLName(subsIdentification.getLName().toString());
			subsIdentificationCache.setLastCity(subsIdentification.getLastCity().toString());
			subsIdentificationCache.setBalance(subsIdentification.getBalance());
			subsIdentificationCache.setState(PROCESSED);
			subsIdentificationCache.setSourceTopic(sourceTopic);
		} catch (Exception e) {
			log.error("Error in building NF Cache Object: {}", e.getMessage());
		}
		return subsIdentificationCache;
	}
	private String writeAsString(SubsIdentificationEvent data) {
		StringBuilder sb = new StringBuilder();
		if (data.getMsisdn() != null)
			sb.append(data.getMsisdn());
		sb.append(producerDelimeter);
		if (data.getImsi() != null)
			sb.append(data.getImsi());
		sb.append(producerDelimeter);
		if (data.getSubsId() != null)
			sb.append(data.getSubsId());
		sb.append(producerDelimeter);
		if (data.getBrand() != null)
			sb.append(data.getBrand());
		sb.append(producerDelimeter);
		if (data.getFName() != null)
			sb.append(data.getFName());
		sb.append(producerDelimeter);
		if (data.getLName() != null)
			sb.append(data.getLName());
		sb.append(producerDelimeter);
		if (data.getLastCity() != null)
			sb.append(data.getLastCity());
		sb.append(producerDelimeter);
		if (data.getBalance() != null)
			sb.append(data.getBalance());
		sb.append(producerDelimeter);
		return sb.toString();
	}
	public void sendToKafka(String record, String topic) {
		try {
			if (isSendToKafka) {
				kafkaProducerEventClient.sendMessage(topic, record);
				log.info("Data sent to kafka successfully - TOPIC: {} - MESSAGE: {}", topic, record);
			}

		} catch (Exception e) {
			log.error("Error in sendToKafka: {}", e.getMessage());
		}
	}

}
