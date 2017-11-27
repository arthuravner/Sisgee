package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Curso {

	@Id
	@GeneratedValue
	private int idCurso;

	@Column(name="nomeCurso",length=255,nullable=true)
	private String nomeCurso;

	@Column(name="codigoCurso",length=255,nullable=true)
	private String codigoCurso;


	@ManyToOne()
	@JoinColumn(name = "idCampus")
	private Campus campus;

	/**
	 * @return the idCurso
	 */
	public int getIdCurso() {
		return idCurso;
	}
	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	/**
	 * @return the nomeCurso
	 */
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	/**
	 * @return the codigoCurso
	 */
	public String getCodigoCurso() {
		return codigoCurso;
	}
	/**
	 * @param codigoCurso the codigoCurso to set
	 */
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	/**
	 * @return the idCampus
	 */
	public Campus getCampus() {
		return campus;
	}
	/**
	 * @param idCampus the idCampus to set
	 */
	public void setCampus(Campus campus) {
		this.campus = campus;
	}



	public Curso( String nomeCurso, String codigoCurso, Campus campus){

		this.campus= campus;
		
		this.nomeCurso = nomeCurso;
		this.codigoCurso=codigoCurso;


	}
	public Curso() {

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCurso;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (idCurso != other.idCurso)
			return false;
		return true;
	}
	/**
	 * @param nomeCurso the nomeCurso to set
	 */

}
