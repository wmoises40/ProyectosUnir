package javabean;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

	private String idCliente;
	private String nombre;
	private String email;
	private LocalDate createAt;
	private DireccionCliente direccion;
	private TarjetaBancaria tarjeta;
	
	public Cliente(String idCliente, String nombre, String email, LocalDate createAt, DireccionCliente direccion,
			TarjetaBancaria tarjeta) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
		this.createAt = createAt;
		this.direccion = direccion;
		this.tarjeta = tarjeta;
	}

	public Cliente() {
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

	public TarjetaBancaria getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaBancaria tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", createAt=" + createAt
				+ ", direccion=" + direccion + ", tarjeta=" + tarjeta + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createAt, direccion, email, idCliente, nombre, tarjeta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(createAt, other.createAt) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(tarjeta, other.tarjeta);
	}
	
	
}
