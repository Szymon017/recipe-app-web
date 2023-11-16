package szymon017.springframework.recipespringweb.repositories;

import org.springframework.data.repository.CrudRepository;
import szymon017.springframework.recipespringweb.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
