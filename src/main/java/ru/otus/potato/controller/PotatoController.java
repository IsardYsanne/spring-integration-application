package ru.otus.potato.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.potato.integration.PotatoGateway;
import ru.otus.potato.model.Potato;

@Slf4j
@RestController
@RequestMapping("potatoes")
public class PotatoController {

    @Autowired
    private PotatoGateway potatoGateway;

    @PostMapping("/save")
    public ResponseEntity<Potato> addNewPotatoFries() {
        log.info("Робот стартует.");
        potatoGateway.processNewPotatoFries(new Potato());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
