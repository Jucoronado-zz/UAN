package uan.edu.co.customer.manager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author 
 *
 */
@Entity
@Table(name = "customer")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfertaInmobiliaria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2915524939360833764L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idmueble;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "barrio")
	private String barrio;

	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "departamento")
	private String departamento;
	
	@Column(name = "dormitorio")
	private String superficie;
	
	@Column(name = "precio")
	private String precio;
	
	@Column(name = "observacion")
	private String observacion;
	
	@Column(name = "idpropietario")
	private long idpropietario;
	
	protected OfertaInmobiliaria() {
	}

	
	public OfertaInmobiliaria(String direccion, String barrio, String ciudad, String departamento,
			String superficie, String precio, String observacion, long idpropietario) {

		this.direccion = direccion;
		this.barrio = barrio;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.superficie = superficie;
		this.precio = precio;
		this.observacion = observacion;
		this.idpropietario = idpropietario;
	}


	public long getIdmueble() {
		return idmueble;
	}

	public void setIdmueble(long idmueble) {
		this.idmueble = idmueble;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public long getIdpropietario() {
		return idpropietario;
	}

	public void setIdpropietario(long idpropietario) {
		this.idpropietario = idpropietario;
	}

	

}
