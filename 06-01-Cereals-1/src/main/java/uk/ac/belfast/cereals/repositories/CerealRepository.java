package uk.ac.belfast.cereals.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfast.cereals.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer> {

}
