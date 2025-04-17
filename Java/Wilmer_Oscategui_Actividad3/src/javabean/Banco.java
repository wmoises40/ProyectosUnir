package javabean;

import java.util.Objects;

public class Banco {

	private int codigo;
	private String nombre;
	private Pais pais;
	
	public Banco(int codigo, String nombre, Pais pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.pais = pais;
	}

	public Banco() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Banco [codigo=" + codigo + ", nombre=" + nombre + ", pais=" + pais + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return codigo == other.codigo && Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais);
	}
	
	
}
