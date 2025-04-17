package javabean;

import java.time.LocalDate;
import java.util.Objects;

public class Pedido {

	private int idPedido;
	private LocalDate createAt;
	private String estado;
	private Cliente cliente;
	
	public Pedido(int idPedido, LocalDate createAt, String estado, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.createAt = createAt;
		this.estado = estado;
		this.cliente = cliente;
	}

	public Pedido() {
		super();
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", createAt=" + createAt + ", estado=" + estado + ", cliente=" + cliente
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, createAt, estado, idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(createAt, other.createAt)
				&& Objects.equals(estado, other.estado) && idPedido == other.idPedido;
	}
	
	
	
}
