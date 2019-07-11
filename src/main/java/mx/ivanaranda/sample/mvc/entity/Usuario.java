package mx.ivanaranda.sample.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO") // NOTACION PARA EL NOMBRE DE TABLA
public class Usuario {
	// LOS TIPOS DE PARA GenerationType SON:
	// AUTO: SE CREAN LOS AUTOINCREMENTABLES CON AYUDA DEL HIBERNATE Y SQL (TABLA:hibernate_sequence) 
	//		SI SE REQUIERE QUE NO APAREZCA LA TABLA DE SQL, SE AGREGA EN application.properties LO SIGUIENTE:
	//		spring.jpa.hibernate.use-new-id-generator-mappings=false
	// IDENTITY: SE ASIGNAN PRIMARY KEY A LOS CAMPOS AUTOINCREMENTABLES  
    @Id // NOTACION PARA INDICAR EL INDICE PRINCIPAL
    @GeneratedValue(strategy=GenerationType.IDENTITY) // NOTACION PARA INDICAR QUE EL CAMPO SERA AUTOINCREMENTABLE
    @Column(name = "N_ID") // NOTACION PARA INDICAR EL NOMBRE DE LA COLUMNA
    private Long id;

    @Column(name = "C_NOMBRE")
    private String nombre;

    @Column(name = "C_EMAIL")
    private String email;

    @Column(name = "N_EDAD")
    private Integer edad;
    
    @Column(name = "C_SEXO")
    private String sexo;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", sexo=" + sexo
				+ "]";
	}
    
    
}

