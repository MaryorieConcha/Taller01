package model;

public class Computadores extends DispositivoTecnologico {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;

	public Computadores(String marca, String ram, String almacenamiento, String procesador,
						String modelo, int fabricationDate, int precio, int stock, String tarjetaVideo,
						String fuentePoder, String chasis, Pantalla pantalla) {
		super(marca, ram, almacenamiento, procesador, modelo, fabricationDate, precio, stock);
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	public String getTipo() {
		return "Computadores";
	}

	public void obtenerInformacion() {
		System.out.println(super.getMarca()+", "+ super.getRam()+", "+super.getAlmacenamiento()+", "+super.getProcesador()+", "+
				super.getModelo()+", "+super.getFabricationDate()+", "+super.getPrecio()+", "+super.getStock());
		System.out.println(this.tarjetaVideo+", "+this.fuentePoder+", "+this.chasis+", "+this.pantalla);
	}


	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Pantalla getPantalla() {
		return this.pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}
}