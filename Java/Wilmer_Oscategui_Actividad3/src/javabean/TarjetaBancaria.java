package javabean;

import java.util.Objects;

public class TarjetaBancaria {

	private long numero;
	private int year;
	private int mes;
	private int cvv;
	private Banco banco;
	
	public TarjetaBancaria(long numero, int year, int mes, int cvv, Banco banco) {
		super();
		this.numero = numero;
		this.year = year;
		this.mes = mes;
		this.cvv = cvv;
		this.banco = banco;
	}

	public TarjetaBancaria() {
		super();
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "TarjetaBancaria [numero=" + numero + ", year=" + year + ", mes=" + mes + ", cvv=" + cvv + ", banco="
				+ banco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(banco, cvv, mes, numero, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaBancaria other = (TarjetaBancaria) obj;
		return Objects.equals(banco, other.banco) && cvv == other.cvv && mes == other.mes && numero == other.numero
				&& year == other.year;
	}
	
	
}
