package uk.ac.belfast.titanic.respository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfast.titanic.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
	
}

