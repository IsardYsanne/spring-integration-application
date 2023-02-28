package ru.otus.potato.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.MessageChannel;

@Configuration
public class IntegrationConfig {

    @Bean
    public MessageChannel potatoWithoutSauceChannel() {
        return MessageChannels.direct().get();
    }

    @Bean
    public MessageChannel cookedPotatoChannel() {
        return MessageChannels.direct().get();
    }

    @Bean
    public IntegrationFlow potatoFlow() {
        return IntegrationFlows
                .from("potatoWithoutSauceChannel")
                .handle("potatoServiceImpl", "addSauceForPotato")
                .channel("cookedPotatoChannel")
                .get();
    }
}
