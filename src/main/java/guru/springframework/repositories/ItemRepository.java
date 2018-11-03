package guru.springframework.repositories;

import guru.springframework.domain.Item;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
