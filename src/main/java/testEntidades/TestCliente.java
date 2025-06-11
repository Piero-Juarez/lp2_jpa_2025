package testEntidades;

import java.util.List;

import dao.ClienteImp;
import modelo.Cliente;

public class TestCliente {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		ClienteImp clienteImp = new ClienteImp();

		// A�adiendo datos
		cliente.setId(3);
		/*cliente.setNombre("Leo");
		cliente.setApellidos("Messi");
		cliente.setDni("3841841");
		cliente.setEmail("la_cabra@gmail.com");
		cliente.setSexo("M");
		cliente.setNacionalidad("Argentina");
		cliente.setTelefono("264813");*/

		// Invocaci�n del m�todo crear
		//clienteImp.registrarCliente(cliente);
		
		// Invocaci�n del m�todo actualizar
		//clienteImp.actualizarCliente(cliente);
		
		// Invocaci�n del m�todo eliminar
		//clienteImp.eliminarCliente(cliente);
		
		// Invocaci�n del m�todo listar
		/*List<Cliente> listaClietes = clienteImp.listarCliente();
		for(Cliente c : listaClietes) {
			System.out.println(c);
		}*/
		
		// Testear el m�todo buscar
		Cliente clienteEncontrado = clienteImp.buscarCliente(cliente);
		System.out.println(clienteEncontrado);
		
		System.out.println("El cliente se encontr� correctamente.");
		
	}
}
