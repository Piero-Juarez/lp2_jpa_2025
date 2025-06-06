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
		
		// Invocaci�n del m�todo crear
		//usuarioImp.registrarUsuario(usuario);
		
		// Invocaci�n del m�todo actualizar
		//clienteImp.actualizarCliente(cliente);
		
		// Invocaci�n del m�todo eliminar
		//clienteImp.eliminarCliente(cliente);
		
		// Invocaci�n del m�todo listar
		List<Usuario> listaUsuarios = usuarioImp.listarUsuarios();
		for(Usuario u : listaUsuarios) {
			System.out.println(u);
		}
		
		System.out.println("El usuario se list� correctamente.");
		
	}
}
