package interfaces;

import java.util.List;

import modelo.Usuario;

public interface IUsuario {

	// Declaración de métodos
	void registrarUsuario(Usuario usuarioNuevo);
	void actualizarUsuario(Usuario usuarioActualizado);
	void eliminarUsuario(Usuario usuarioEliminado);
	List<Usuario> listarUsuarios();
	Usuario buscarUsuario(Usuario usuarioBuscado);
	
}
