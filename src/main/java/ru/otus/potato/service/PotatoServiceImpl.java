package ru.otus.potato.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;
import ru.otus.potato.model.Potato;
import ru.otus.potato.model.SauceForPotato;
import ru.otus.potato.repository.PotatoRepository;
import ru.otus.potato.repository.SauceRepository;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Slf4j
@Service
public class PotatoServiceImpl implements PotatoService {

    private String[] saucesForPotato = {"сырный", "барбекю", "тирияки", "кисло-сладкий", "карри", "кепчунез", "чесночный", "сальса"};

    private PotatoRepository potatoRepository;

    private SauceRepository sauceRepository;

    public PotatoServiceImpl(PotatoRepository potatoRepository, SauceRepository sauceRepository) {
        this.potatoRepository = potatoRepository;
        this.sauceRepository = sauceRepository;
    }

    @Override
    public Potato addSauceForPotato(Potato potato) {
        final Set<SauceForPotato> sauces = new HashSet<>();
        if (Objects.isNull(potato.getSauces())) {
            potato.setSauces(sauces);
        }
        log.info("Добавляем соус к картошке.");
        addSauce(potato, saucesForPotato[RandomUtils.nextInt(0, saucesForPotato.length)]);
        return potato;
    }

    @Override
    public boolean addSauce(Potato potato, String sauceName) {
        final SauceForPotato sauce = new SauceForPotato(sauceName, potato);
        potato.getSauces().add(sauce);
        potatoRepository.save(potato);
        sauceRepository.save(sauce);
        log.info("Соус " + sauceName +  " добавлен.");
        return true;
    }
}
