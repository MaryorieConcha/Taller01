package model;

public class Cliente {
	private String nombre;
	private String apelido;
	private String mail;
	private int numeroContacto;
	private String estadoCivil;
	private String ciudad;
	public Tienda tienda;

	public Cliente(String nombre, String apelido, String mail, int numeroContacto, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.apelido = apelido;
		this.mail = mail;
		this.numeroContacto = numeroContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelido() {
		return this.apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void buscarDispositivo(Tienda tienda){}
}