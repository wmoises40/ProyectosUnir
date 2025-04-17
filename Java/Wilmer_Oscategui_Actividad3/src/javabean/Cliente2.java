package javabean;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Cliente2 {

	private String idCliente;
	private String nombre;
	private String email;
	private LocalDate createAt;
	private DireccionCliente direccion;
	private List<TarjetaBancaria> tarjetas;
	
	public Cliente2(String idCliente, String nombre, String email, LocalDate createAt, DireccionCliente direccion,
			List<TarjetaBancaria> tarjetas) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
		this.createAt = createAt;
		this.direccion = direccion;
		this.tarjetas = tarjetas;	
	}

	public Cliente2() {
		super();
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}

	public DireccionCliente getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionCliente direccion) {
		this.direccion = direccion;
	}

	public List<TarjetaBancaria> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<TarjetaBancaria> tarjetas) {
		this.tarjetas = tarjetas;
	}

	@Override
	public String toString() {
		return "Cliente2 [idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", createAt=" + createAt
				+ ", direccion=" + direccion + ", tarjetas=" + tarjetas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createAt, direccion, email, idCliente, nombre, tarjetas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente2 other = (Cliente2) obj;
		return Objects.equals(createAt, other.createAt) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(tarjetas, other.tarjetas);
	}
	
	
	
}
