package model;

public abstract class DispositivoTecnologico {
	private String marca;
	private String ram;
	private String almacenamiento;
	private String procesador;
	private String modelo;
	private int fabricationDate;
	private int precio;
	private int stock;
	public Tienda tienda;

	public DispositivoTecnologico(String marca, String ram, String almacenamiento,
								  String procesador, String modelo, int fabricationDate, int precio, int stock) {
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.fabricationDate = fabricationDate;
		this.precio = precio;
		this.stock = stock;
	}

	public abstract String getTipo();

	public abstract void obtenerInformacion();

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getFabricationDate() {
		return this.fabricationDate;
	}

	public void setFabricationDate(int fabricationDate) {
		this.fabricationDate = fabricationDate;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
}