package testEntidades;

import java.util.List;

import dao.ClienteImp;
import modelo.Cliente;

public class TestCliente {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		ClienteImp clienteImp = new ClienteImp();

		// Añadiendo datos
		cliente.setId(3);
		/*cliente.setNombre("Leo");
		cliente.setApellidos("Messi");
		cliente.setDni("3841841");
		cliente.setEmail("la_cabra@gmail.com");
		cliente.setSexo("M");
		cliente.setNacionalidad("Argentina");
		cliente.setTelefono("264813");*/

		// Invocación del método crear
		//clienteImp.registrarCliente(cliente);
		
		// Invocación del método actualizar
		//clienteImp.actualizarCliente(cliente);
		
		// Invocación del método eliminar
		//clienteImp.eliminarCliente(cliente);
		
		// Invocación del método listar
		/*List<Cliente> listaClietes = clienteImp.listarCliente();
		for(Cliente c : listaClietes) {
			System.out.println(c);
		}*/
		
		// Testear el método buscar
		Cliente clienteEncontrado = clienteImp.buscarCliente(cliente);
		System.out.println(clienteEncontrado);
		
		System.out.println("El cliente se encontró correctamente.");
		
	}
}
