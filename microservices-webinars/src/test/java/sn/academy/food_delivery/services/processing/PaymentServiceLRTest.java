package sn.academy.food_delivery.services.processing;

import java.util.Collections;
import java.util.HashMap;
import org.apache.pulsar.client.impl.schema.AvroSchema;
import org.apache.pulsar.common.functions.ConsumerConfig;
import org.apache.pulsar.common.functions.FunctionConfig;
import org.apache.pulsar.functions.LocalRunner;
import sn.academy.food_delivery.config.AppConfig;
import sn.academy.food_delivery.models.avro.Payment;

public class PaymentServiceLRTest {
    public static void main(String[] args) throws Exception {
        HashMap<String, ConsumerConfig> inputSpecs = new HashMap<>();
        inputSpecs.put(AppConfig.PAYMENTS_TOPIC_NAME, ConsumerConfig.builder().schemaType(AvroSchema.of(Payment.class).getSchemaInfo().getName()).build());

        FunctionConfig functionConfig = FunctionConfig.builder()
                .className(PaymentService.class.getName())
                .inputs(Collections.singletonList(AppConfig.PAYMENTS_TOPIC_NAME))
                .inputSpecs(inputSpecs)
                .name("payment-service")
                .runtime(FunctionConfig.Runtime.JAVA)
                .subName("payment-service-subscription")
                .cleanupSubscription(true)
                .build();

        LocalRunner localRunner = LocalRunner.builder()
                .brokerServiceUrl(AppConfig.SERVICE_URL)
                .functionConfig(functionConfig)
                .build();

        localRunner.start(false);
        Thread.sleep(30000);
        localRunner.stop();
        System.exit(0);
    }
}
