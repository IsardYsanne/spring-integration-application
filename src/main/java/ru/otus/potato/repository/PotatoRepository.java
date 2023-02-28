package ru.otus.potato.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.otus.potato.model.Potato;

@Repository
public interface PotatoRepository extends CrudRepository<Potato, Integer> {
}
