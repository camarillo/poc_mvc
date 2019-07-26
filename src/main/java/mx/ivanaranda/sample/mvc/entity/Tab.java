package mx.ivanaranda.sample.mvc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="TAB")
public class Tab {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="N_TAB_ID")
	private Long tabId;

	@Column(name="C_NOMBRE")
	private String nombre;
	
	@OneToMany(mappedBy="tab")
	private List<Seccion> secciones;
	
	public List<Seccion> getSecciones() {
		return secciones;
	}
	public void setSecciones(List<Seccion> secciones) {
		this.secciones = secciones;
	}
	public Long getTabId() {
		return tabId;
	}
	public void setTabId(Long tabId) {
		this.tabId = tabId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
