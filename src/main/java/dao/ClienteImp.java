package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.ICliente;
import modelo.Cliente;

public class ClienteImp implements ICliente {

	// Conexi�n con la U.P.
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
	
	public void registrarCliente(Cliente clienteNuevo) {
		// Administrar la transacci�n
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			// Iniciando la transacci�n
			entityManager.getTransaction().begin();
			
			// Invocamos el m�todo registrar
			entityManager.persist(clienteNuevo);
			
			// Confirmaci�n de la transacci�n
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public void actualizarCliente(Cliente clienteActualizado) {
		// Administrar la transacci�n
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			// Iniciando la transacci�n
			entityManager.getTransaction().begin();
			
			// Invocamos el m�todo registrar
			entityManager.merge(clienteActualizado);
			
			// Confirmaci�n de la transacci�n
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public void eliminarCliente(Cliente clienteEliminado) {
		// Administrar la transacci�n
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			// Iniciando la transacci�n
			entityManager.getTransaction().begin();
			
			// Invocamos el m�todo registrar
			Cliente idClienteEliminado = entityManager.find(Cliente.class, clienteEliminado.getId());
			if (idClienteEliminado != null) { entityManager.remove(idClienteEliminado); }
			
			// Confirmaci�n de la transacci�n
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public List<Cliente> listarCliente() {
		// Administrar la transacci�n
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Cliente> listaClientes = null;
		try {
			// Iniciando la transacci�n
			entityManager.getTransaction().begin();
			
			// Invocamos el m�todo registrar
			listaClientes = entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
			
			// Confirmaci�n de la transacci�n
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
		return listaClientes;
	}

	public Cliente buscarCliente(Cliente clienteBuscado) {
		// Administrar la transacci�n
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Cliente clienteEncontrado = null;
		try {
			// Iniciando la transacci�n
			entityManager.getTransaction().begin();
			
			// Invocamos el m�todo registrar
			clienteEncontrado = entityManager.find(Cliente.class, clienteBuscado.getId());
			
			// Confirmaci�n de la transacci�n
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
		return clienteEncontrado;
	}
	
}
