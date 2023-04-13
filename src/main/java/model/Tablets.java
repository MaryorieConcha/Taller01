package model;

import java.util.List;

public class Tablets extends DispositivoTecnologico {
	private String resolucionPantalla;
	private List<String> accesorios;

	public Tablets(String marca, String ram, String almacenamiento, String procesador,
				   String modelo, int fabricationDate, int precio, int stock, String resolucionPantalla,
				   List<String> accesorios) {
		super(marca, ram, almacenamiento, procesador, modelo, fabricationDate, precio, stock);
		this.resolucionPantalla = resolucionPantalla;
		this.accesorios = accesorios;
	}

	public String getTipo() {
		return "Tablets";
	}

	public void obtenerInformacion() {
		System.out.println(super.getMarca()+", "+ super.getRam()+", "+super.getAlmacenamiento()+", "+super.getProcesador()+", "+
				super.getModelo()+", "+super.getFabricationDate()+", "+super.getPrecio()+", "+super.getStock());
		System.out.println(this.resolucionPantalla+", "+this.accesorios);
	}


	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public List<String> getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(List<String> accesorios) {
		this.accesorios = accesorios;
	}
}