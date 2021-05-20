package ncrivelli.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ncrivelli.crud.interfaceService.IPersonaService;
import ncrivelli.crud.interfaces.IPersona;
import ncrivelli.crud.modelo.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listar() {
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarID(int id) {
		return data.findById(id);
	}

	@Override
	public int guardar(Persona p) {
		int respuesta=0;
		Persona persona = data.save(p);
		
		if(!persona.equals(null))	respuesta=1;
		
		return respuesta;
	}

	@Override
	public void eliminar(int id) {
		data.deleteById(id);
	}

}
