package m.maznitsyn.springbootkafka.kafka;

import m.maznitsyn.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.jsonTopic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(User user) {
        log.info("Consumed user: {}", user);
    }
}
