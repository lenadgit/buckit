package guru.springframework.repositories;

import guru.springframework.domain.Category;

import org.springframework.data.repository.CrudRepository;

public interface ItemGroupRepository extends CrudRepository<Category, Long> {
}
