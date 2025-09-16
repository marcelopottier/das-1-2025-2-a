package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Publisher {
    public static void main(String[] args) {
        var servidor = "sbdas12025a.servicebus.windows.net";
        var topicName = "topic-das1-a";
        DefaultAzureCredential credential = new DefaultAzureCredentialBuilder().build();
        ServiceBusSenderClient sender = new ServiceBusSenderClientBuilder()
                .fullyQualifiedNamespace(servidor)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .topicName(topicName)
                .sender()
                .credential(credential)
                .buildClient();
    }
}
