package model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Campus {

	 @Id
	 @GeneratedValue
	 @Column (name="idPessoa", unique = true)
	 private int idCampus;
		 
	 @Column (name="nomeCampus",length=100,nullable=false)
	 private String nomeCampus;

	 
	public int getIdCampus() {
		return idCampus;
	}

	public String getNomeCampus() {
		return nomeCampus;
	}

	public void setNomeCampus(String nomeCampus) {
		this.nomeCampus = nomeCampus;
	}

	@Override
	public String toString() {
		return "Campus [nomeCampus=" + nomeCampus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCampus;
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
		Campus other = (Campus) obj;
		if (idCampus != other.idCampus)
			return false;
		return true;
	} 
}
