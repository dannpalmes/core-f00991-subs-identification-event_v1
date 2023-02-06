package ph.com.globe.edo.aim.arrow.core.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import ph.com.globe.edo.aim.arrow.aerospike.service.AerospikeService;
import ph.com.globe.edo.aim.arrow.core.dto.SubsIdentification;
import ph.com.globe.edo.aim.arrow.core.process.ProcessEvent;
import ph.com.globe.edo.aim.arrow.kafka.consumer.config.KafkaConsumerProperty;
import ph.com.globe.edo.aim.arrow.kafka.consumer.handler.AvroObjectKafkaConsumerMessageProcessor;
import ph.com.globe.edo.aim.arrow.kafka.consumer.handler.MessageType;
import ph.com.globe.edo.aim.steps.component.utility.StepsStringUtil;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG;
import static ph.com.globe.edo.aim.arrow.core.constants.SubsCacheEventConstants.*;
import static ph.com.globe.edo.aim.arrow.kafka.consumer.handler.MessageType.DELIMITED;

@Slf4j
@Dependent
public class SubsIdentificationService extends AvroObjectKafkaConsumerMessageProcessor<SubsIdentification, String[]> {
	@ConfigProperty(name = "is.process-event.subs-identification", defaultValue = "true")
	boolean isProcessEvent;
	@ConfigProperty(name = "message.delimiter", defaultValue = "\t")
	String delimiter;
	@ConfigProperty(name = "consumer.threads.subs-identification")
	int threads;
//	@ConfigProperty(name = "consumer.kafka.topic.subs-identification")
//	String consumerTopic;
	@ConfigProperty(name = "f00991_subs_identification_event_v1")
	String consumerTopic;
//	@ConfigProperty(name = "consumer.group.id.subs-identification")
//	String groupId;

	@ConfigProperty(name = "edo_npck_ch_cg_f00991_subs_identification_cc")
	String groupId;

//	@ConfigProperty(name = "producer.topic")
//	String produceTopic;
	@ConfigProperty(name = "f00991_subs_identification_processed_v1")
	String produceTopic;
	@Inject
	KafkaConsumerProperty property;
	@Inject
	ProcessEvent processEvent;
	@Inject
	AerospikeService aerospikeService;
	ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String messageDelimiter() {
		return delimiter;
	}

	@Override
	public MessageType messageType() {
		return DELIMITED;
	}

	@Override
	public void processEvent(SubsIdentification data) {
		if (isProcessEvent) {
			processEvent.processEventSubs(data, consumerTopic, produceTopic);
		}
	}

	@Override
	public Map<String, Object> properties() {
		Map<String, Object> properties = property.getConfigs();
		properties.put(GROUP_ID_CONFIG, groupId);
		return properties;
	}

	@Override
	public int threads() {
		return threads;
	}

	@Override
	public String topic() {
		return consumerTopic;
	}

	@Override
	public SubsIdentification getSourceObject(String[] values) {
		SubsIdentification subsIdentification = new SubsIdentification();
		try {
			log.info("getSourceObject data: {}", objectMapper.writeValueAsString(values));
			if (values.length >= subsIdentification.getSchema().getFields().size()) {
				subsIdentification.setMsisdn(values[0]);
				subsIdentification .setImsi(values[1]);
				subsIdentification.setSubsId(values[2]);
				subsIdentification.setBrand(values[3]);
				subsIdentification.setFName(values[4]);
				subsIdentification.setLName(values[5]);
				subsIdentification.setLastCity(values[6]);
				subsIdentification.setBalance(StepsStringUtil.parseLong(dataObject(values[7])));
			}
		} catch (Exception e) {
			log.error(ERROR, "getSourceObject()", e.getMessage(), Arrays.asList(e.getStackTrace()));
			e.printStackTrace();
		}
		return subsIdentification;
	}


	private static String dataObject(Object o) {
		String ret = ZERO;
		if (o != null && !o.toString().equalsIgnoreCase(NULL) && !o.toString().equals(EMPTY)) {
			ret = o.toString();
		}
		return ret;
	}

}
