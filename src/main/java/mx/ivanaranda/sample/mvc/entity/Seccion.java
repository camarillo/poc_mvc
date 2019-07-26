package mx.ivanaranda.sample.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SECCION")
public class Seccion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="N_SECCION_ID")
	private Long seccionId;
	
	@Column(name="C_NOMBRE")
	private String nombre;

	@ManyToOne
	@JoinColumn(name="N_TAB_ID")
	private Tab tab; 
	
	public Tab getTab() {
		return tab;
	}

	public void setTab(Tab tab) {
		this.tab = tab;
	}

	public Long getSeccionId() {
		return seccionId;
	}

	public void setSeccionId(Long seccionId) {
		this.seccionId = seccionId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
