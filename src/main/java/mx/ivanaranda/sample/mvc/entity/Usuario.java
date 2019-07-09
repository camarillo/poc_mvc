package mx.ivanaranda.sample.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER") // NOTACION PARA EL NOMBRE DE TABLA
public class Usuario {
    @Id // NOTACION PARA INDICAR EL INDICE PRINCIPAL
    @GeneratedValue(strategy=GenerationType.AUTO) // NOTACION PARA INDICAR QUE EL CAMPO SERA AUTONUMERICO
    @Column(name = "N_ID") // NOTACION PARA INDICAR EL NOMBRE DE LA COLUMNA
    private Long id;

    @Column(name = "C_NAME")
    private String name;

    @Column(name = "C_EMAIL")
    private String email;

    @Column(name = "N_edad")
    private Integer edad;
    
    @Column(name = "C_SEXO")
    private String sexo;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// SOBRESCRIENDO LA CLASE TO STRING PARA MOSTRAR EL OBJETO.
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
    
    
}

