package uk.ac.belfast.dwarfs.reposiitories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfast.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	///Iterable<Dwarf> findByAuthor(String string);

	//Dwarf findByName(String string);
   // Iterable <Dwarf> findTop3ByAuthor(String string);
    
   // Iterable <Dwarf> findByOrderByName(String string);

    Iterable <Dwarf>  findByOrderByName();

	Iterable <Dwarf>  findByOrderByName(String string);

	Iterable <Dwarf>findByAuthor(String string);
    
}
