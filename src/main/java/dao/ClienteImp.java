package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.ICliente;
import modelo.Cliente;

public class ClienteImp implements ICliente {

	// Conexión con la U.P.
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
	
	public void registrarCliente(Cliente clienteNuevo) {
		// Administrar la transacción
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			// Iniciando la transacción
			entityManager.getTransaction().begin();
			
			// Invocamos el método registrar
			entityManager.persist(clienteNuevo);
			
			// Confirmación de la transacción
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public void actualizarCliente(Cliente clienteActualizado) {
		// Administrar la transacción
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			// Iniciando la transacción
			entityManager.getTransaction().begin();
			
			// Invocamos el método registrar
			entityManager.merge(clienteActualizado);
			
			// Confirmación de la transacción
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public void eliminarCliente(Cliente clienteEliminado) {
		// Administrar la transacción
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			// Iniciando la transacción
			entityManager.getTransaction().begin();
			
			// Invocamos el método registrar
			Cliente idClienteEliminado = entityManager.find(Cliente.class, clienteEliminado.getId());
			if (idClienteEliminado != null) { entityManager.remove(idClienteEliminado); }
			
			// Confirmación de la transacción
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public List<Cliente> listarCliente() {
		// Administrar la transacción
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Cliente> listaClientes = null;
		try {
			// Iniciando la transacción
			entityManager.getTransaction().begin();
			
			// Invocamos el método registrar
			listaClientes = entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
			
			// Confirmación de la transacción
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
		return listaClientes;
	}

	public Cliente buscarCliente(Cliente clienteBuscado) {
		// Administrar la transacción
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Cliente clienteEncontrado = null;
		try {
			// Iniciando la transacción
			entityManager.getTransaction().begin();
			
			// Invocamos el método registrar
			clienteEncontrado = entityManager.find(Cliente.class, clienteBuscado.getId());
			
			// Confirmación de la transacción
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
		return clienteEncontrado;
	}
	
}
