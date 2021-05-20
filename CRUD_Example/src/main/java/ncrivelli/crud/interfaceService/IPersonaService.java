package ncrivelli.crud.interfaceService;

import java.util.List;
import java.util.Optional;

import ncrivelli.crud.modelo.Persona;

public interface IPersonaService {
	
	public List<Persona> listar();
	public Optional<Persona> listarID(int id);
	public int guardar(Persona p);
	public void eliminar(int id);
}
