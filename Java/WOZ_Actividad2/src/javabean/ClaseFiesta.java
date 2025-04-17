package javabean;

public class ClaseFiesta {

	private String tipoFiesta, direccion, fecha, hora;     //atributos de instancia
	private int bebidas, invitados, bocadillos;
	
	
	public ClaseFiesta() {        //constructor vacío
		super();
	}


	public ClaseFiesta(String tipoFiesta, String direccion, String fecha, String hora, int bebidas, int invitados,
			int bocadillos) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.fecha = fecha;
		this.hora = hora;                          //constructor con todos los parámetros
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.bocadillos = bocadillos;
	}


	public String getTipoFiesta() {
		return tipoFiesta;
	}


	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public int getBebidas() {
		return bebidas;
	}


	public void setBebidas(int bebidas) {       //getters y setters
		this.bebidas = bebidas;
	}


	public int getInvitados() {
		return invitados;
	}


	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}


	public int getBocadillos() {
		return bocadillos;
	}


	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	//método toString, este método recopila los datos de los atributos
	@Override
	public String toString() {
		return "Tipo de fiesta: " + tipoFiesta + " direccion: " + direccion + " bebidas: " + bebidas + " bocadillos: " + bocadillos +
				" fecha: " + fecha + " hora: " + hora + " invitados: " +  invitados; 
	}
	//método invitar, este método añade solamente un invitado más
	public void invitar() {     
		invitados++; 
	}
	//método invitar sobrecargado, este método añade los invitados que queramos
	public void invitar(int cantidad) {
		invitados += cantidad;
	}
	//método precioFiesta, este método calcula el precio total en base  a la cantidad de invitados, bebidas y bocadillos
	public int precioFiesta() {
		return (invitados*5) + (bebidas*2) + (bocadillos*3);
	}	
	//método cancelar invitacion, este método solo cancela la invitación de una persona
	public void cancelarInvitacion() {
		invitados--;
	}
	//método cancelar invitacion sobrecargado, este método cancela la invitación de las personas que queramos
	public void cancelarInvitacion(int cantidad) {
		invitados-=cantidad;
	}
	
	
}
