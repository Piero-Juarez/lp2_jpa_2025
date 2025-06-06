package interfaces;

import java.util.List;

import modelo.Cliente;

public interface ICliente {

	// Declaraci�n de m�todos
	void registrarCliente(Cliente clienteNuevo);
	void actualizarCliente(Cliente clienteActualizado);
	void eliminarCliente(Cliente clienteEliminado);
	List<Cliente> listarCliente();
	Cliente buscarCliente(Cliente clienteBuscado);
	
}
