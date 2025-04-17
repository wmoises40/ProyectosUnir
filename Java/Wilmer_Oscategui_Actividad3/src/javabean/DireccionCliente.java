package javabean;

import java.util.Objects;

public class DireccionCliente {

	private String direccion;
	private String localidad;
	private String provincia;
	private Pais pais;
	
	public DireccionCliente(String direccion, String localidad, String provincia, Pais pais) {
		super();
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public DireccionCliente() {
		super();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "DireccionCliente [direccion=" + direccion + ", localidad=" + localidad + ", provincia=" + provincia
				+ ", pais=" + pais + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, localidad, pais, provincia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DireccionCliente other = (DireccionCliente) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(localidad, other.localidad)
				&& Objects.equals(pais, other.pais) && Objects.equals(provincia, other.provincia);
	}
	
	
}
