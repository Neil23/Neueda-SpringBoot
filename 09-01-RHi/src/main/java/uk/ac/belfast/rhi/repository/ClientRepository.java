package uk.ac.belfast.rhi.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfast.rhi.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
	
}

