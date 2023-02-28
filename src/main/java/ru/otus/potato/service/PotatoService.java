package ru.otus.potato.service;

import ru.otus.potato.model.Potato;

public interface PotatoService {

    Potato addSauceForPotato(Potato potato);

    boolean addSauce(Potato potato, String sauceName);
}
