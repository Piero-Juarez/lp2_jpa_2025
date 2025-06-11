package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import modelo.Usuario;

public class UsuarioImp implements IUsuario {

	// Conexión con la U.P.
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
	
	public void registrarUsuario(Usuario usuarioNuevo) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(usuarioNuevo);
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public void actualizarUsuario(Usuario usuarioActualizado) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(usuarioActualizado);
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public void eliminarUsuario(Usuario usuarioEliminado) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			Usuario idUsuarioEliminado = entityManager.find(Usuario.class, usuarioEliminado.getId());
			if (idUsuarioEliminado != null) { entityManager.remove(idUsuarioEliminado); }
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
	}

	public List<Usuario> listarUsuarios() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Usuario> listaUsuarios = null;
		try {
			entityManager.getTransaction().begin();
			listaUsuarios = entityManager.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
		return listaUsuarios;
	}

	public Usuario buscarUsuario(Usuario usuarioBuscado) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Usuario usuarioEncontrado = null;
		try {
			
			entityManager.getTransaction().begin();
			usuarioEncontrado = entityManager.find(Usuario.class, usuarioBuscado.getId());
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) { ex.getMessage();}
		finally { entityManager.close(); }
		return usuarioEncontrado;
	}
	
}
