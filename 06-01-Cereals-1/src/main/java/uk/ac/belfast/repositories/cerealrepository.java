package uk.ac.belfast.repositories;
import org.springframework.data.repository.CrudRepository;

import uk.ac.belfast.domain.Cereal;


	public interface cerealrepository extends CrudRepository<Cereal, Integer> {
		//Iterable<Passenger> findByAgeLessThan(Integer integer);
	
	
	}


