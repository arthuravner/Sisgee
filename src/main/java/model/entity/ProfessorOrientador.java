package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfessorOrientador {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column (name="idProfessorOrientador", unique = true)
	 private int idProfessorOrientador;
		 
	 @Column (name="nomeProfessorOrientador",length=100,nullable=false)
	 private String nomeProfessorOrientador;

	public String getNomeProfessorOrientador() {
		return nomeProfessorOrientador;
	}

	public void setNomeProfessorOrientador(String nomeProfessorOrientador) {
		this.nomeProfessorOrientador = nomeProfessorOrientador;
	}

	@Override
	public String toString() {
		return "ProfessorOrientador [nomeProfessorOrientador=" + nomeProfessorOrientador + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProfessorOrientador;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfessorOrientador other = (ProfessorOrientador) obj;
		if (idProfessorOrientador != other.idProfessorOrientador)
			return false;
		return true;
	}
}
