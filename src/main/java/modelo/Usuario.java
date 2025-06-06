package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario {

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String usuario;
	private String password;
	
	public Usuario() {
	}

	public Usuario(int id, String usuario, String password) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public String getUsuario() { return usuario; }
	public void setUsuario(String usuario) { this.usuario = usuario; }
	
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
}
