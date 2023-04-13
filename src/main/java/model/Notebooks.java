package model;

public class Notebooks extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private String bateria;

	public Notebooks(String marca, String ram, String almacenamiento, String procesador, String modelo,
					 int fabricationDate, int precio, int stock, String resolucionPantalla, String tipoTeclado,
					 String bateria) {
		super(marca, ram, almacenamiento, procesador, modelo, fabricationDate, precio, stock);
		this.resolucionPantalla = resolucionPantalla;
		this.tipoTeclado = tipoTeclado;
		this.bateria = bateria;
	}

	public String getTipo() {
		return "Notebook";
	}

	public void obtenerInformacion() {
		System.out.println(super.getMarca()+", "+ super.getRam()+", "+super.getAlmacenamiento()+", "+super.getProcesador()+", "+
				super.getModelo()+", "+super.getFabricationDate()+", "+super.getPrecio()+", "+super.getStock());
		System.out.println(this.resolucionPantalla+", "+this.tipoTeclado+", "+this.bateria);
	}


	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public String getBateria() {
		return this.bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}
}