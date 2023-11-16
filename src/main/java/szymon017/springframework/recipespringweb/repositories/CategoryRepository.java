package szymon017.springframework.recipespringweb.repositories;

import org.springframework.data.repository.CrudRepository;
import szymon017.springframework.recipespringweb.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
