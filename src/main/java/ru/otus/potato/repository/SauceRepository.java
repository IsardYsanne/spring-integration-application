package ru.otus.potato.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.otus.potato.model.SauceForPotato;

@Repository
public interface SauceRepository extends CrudRepository<SauceForPotato, Integer> {
}
