package model;

import java.util.List;

public class Tienda {
	private String direccion;
	private List<DispositivoTecnologico> catalogo;
	public List<Cliente> clientes;

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<DispositivoTecnologico> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<DispositivoTecnologico> catalogo) {
		this.catalogo = catalogo;
	}

	public boolean agregarClientes(int numeroContacto, Cliente cliente){
		if (buscarCliente(numeroContacto) == null) {
			this.clientes.add(cliente);
			return true;
		}
		else {
			return false;
		}
	}

	public Cliente buscarCliente(int numeroContacto){
		for (Cliente cliente : this.clientes){
			if (cliente.getNumeroContacto() == numeroContacto){
				return cliente;
			}
		}
		return null;
	}

	public DispositivoTecnologico agregarComputadores (Computadores computadores) {
		this.catalogo.add(computadores);
		return computadores;
	}
	public DispositivoTecnologico agregarNotebooks (Notebooks notebooks) {
		this.catalogo.add(notebooks);
		return notebooks;
	}
	public DispositivoTecnologico agregarTablets (Tablets tablets) {
		this.catalogo.add(tablets);
		return tablets;
	}

	public DispositivoTecnologico obtenerInformacion (DispositivoTecnologico dispositivo){
		for (DispositivoTecnologico dispositivoTecnologico : this.catalogo){
			dispositivoTecnologico.obtenerInformacion();
		}
		return dispositivo;
	}

	public List<Cliente> vender(DispositivoTecnologico dispositivoTecnologico){
		return null;
	}

	//Buscar por marca, modelo, o tipo
	public DispositivoTecnologico buscarDispositivoPorMarca(String marca){
		for (DispositivoTecnologico dispositivoTecnologico : this.catalogo){
			if (dispositivoTecnologico.getMarca().equals(marca)){
				return dispositivoTecnologico;
			}
		}
		return null;
	}

	public DispositivoTecnologico buscarDispositivoPorModelo(String modelo){
		for (DispositivoTecnologico dispositivoTecnologico : this.catalogo){
			if (dispositivoTecnologico.getMarca().equals(modelo)){
				return dispositivoTecnologico;
			}
		}
		return null;
	}

	public DispositivoTecnologico buscarDispositivoPorTipo(String tipo){
		for (DispositivoTecnologico dispositivoTecnologico :this.catalogo){
			if (dispositivoTecnologico.getTipo().equals(tipo)){
				return dispositivoTecnologico;
			}
		}
		return null;
	}
}