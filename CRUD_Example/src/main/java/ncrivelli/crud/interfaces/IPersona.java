package ncrivelli.crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ncrivelli.crud.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
