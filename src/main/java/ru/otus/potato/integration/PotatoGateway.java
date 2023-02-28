package ru.otus.potato.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import ru.otus.potato.model.Potato;

@MessagingGateway
public interface PotatoGateway {

    @Gateway(requestChannel = "potatoWithoutSauceChannel", replyChannel = "cookedPotatoChannel")
    Potato processNewPotatoFries(Potato potato);
}
