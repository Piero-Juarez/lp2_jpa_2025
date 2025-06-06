package interfaces;

import java.util.List;

import modelo.Usuario;

public interface IUsuario {

	// Declaraci�n de m�todos
	void registrarUsuario(Usuario usuarioNuevo);
	void actualizarUsuario(Usuario usuarioActualizado);
	void eliminarUsuario(Usuario usuarioEliminado);
	List<Usuario> listarUsuarios();
	Usuario buscarUsuario(Usuario usuarioBuscado);
	
}
