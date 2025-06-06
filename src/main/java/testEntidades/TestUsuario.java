package testEntidades;

import java.util.List;

import dao.UsuarioImp;
import modelo.Usuario;

public class TestUsuario {
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		UsuarioImp usuarioImp = new UsuarioImp();
		
		//usuario.setId(id);
		usuario.setUsuario("Piero");
		usuario.setPassword("247000");
		
		// Invocación del método crear
		//usuarioImp.registrarUsuario(usuario);
		
		// Invocación del método actualizar
		//clienteImp.actualizarCliente(cliente);
		
		// Invocación del método eliminar
		//clienteImp.eliminarCliente(cliente);
		
		// Invocación del método listar
		List<Usuario> listaUsuarios = usuarioImp.listarUsuarios();
		for(Usuario u : listaUsuarios) {
			System.out.println(u);
		}
		
		System.out.println("El usuario se listó correctamente.");
		
	}
}
