package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
@NamedQuery(name="Cliente.findAll", query="SELECT t FROM Cliente t")
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
public class Cliente {

	// DECLARACIÓN DE ATRIBUTOS
	@Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre")
	private String nombre;
	private String apellido;
	private String dni;
	private String sexo;
	private String telefono;
	private String nacionalidad;
	private String email;
	
	// CONSTRUCTOR VACÍO
	public Cliente() {
	}

	// CONSTRUCTOR CON PARÁMETROS
	public Cliente(int id, String nombre, String apellido, String dni, String sexo, String telefono, String nacionalidad, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
		this.telefono = telefono;
		this.nacionalidad = nacionalidad;
		this.email = email;
	}
	
	// GETTERS AND SETTERS
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public String getApellidos() { return apellido; }
	public void setApellidos(String apellidos) { this.apellido = apellidos; }
	
	public String getDni() { return dni; }
	public void setDni(String dni) { this.dni = dni; }
	
	public String getSexo() { return sexo; }
	public void setSexo(String sexo) { this.sexo = sexo; }
	
	public String getTelefono() { return telefono; }
	public void setTelefono(String telefono) { this.telefono = telefono; }
	
	public String getNacionalidad() { return nacionalidad; }
	public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", sexo=" + sexo
				+ ", telefono=" + telefono + ", nacionalidad=" + nacionalidad + ", email=" + email + "]";
	}
	
}
