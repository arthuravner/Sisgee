package model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Convenio {

	@Id
	@GeneratedValue
	private int idConvenio;

	private Date dataInicioConvenio;

	@Column(name="numeroConvenio",length=255,nullable=true)
	private String numeroConvenio;
	
	private Date dataFimConvenio;
		
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEmpresa")
	private Empresa empresa;

	/**
	 * @return the idConvenio
	 */
	public int getIdConvenio() {
		return idConvenio;
	}

	/**
	 * @param idConvenio the idConvenio to set
	 */
	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	/**
	 * @return the dataInicioConvenio
	 */
	public Date getDataInicioConvenio() {
		return dataInicioConvenio;
	}

	/**
	 * @param dataInicioConvenio the dataInicioConvenio to set
	 */
	public void setDataInicioConvenio(Date dataInicioConvenio) {
		this.dataInicioConvenio = dataInicioConvenio;
	}

	/**
	 * @return the numeroConvenio
	 */
	public String getNumeroConvenio() {
		return numeroConvenio;
	}

	/**
	 * @param numeroConvenio the numeroConvenio to set
	 */
	public void setNumeroConvenio(String numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}

	/**
	 * @return the dataFimConvenio
	 */
	public Date getDataFimConvenio() {
		return dataFimConvenio;
	}

	/**
	 * @param dataFimConvenio the dataFimConvenio to set
	 */
	public void setDataFimConvenio(Date dataFimConvenio) {
		this.dataFimConvenio = dataFimConvenio;
	}

	/**
	 * @return the idEmpresa
	 */
	public Empresa getIdEmpresa() {
		return empresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idConvenio;
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
		Convenio other = (Convenio) obj;
		if (idConvenio != other.idConvenio)
			return false;
		return true;
	}

	public Convenio( Date dataInicioConvenio, String numeroConvenio, Date dataFimConvenio,	Empresa empresa) {
		super();
		
		this.dataInicioConvenio = dataInicioConvenio;
		this.numeroConvenio = numeroConvenio;
		this.dataFimConvenio = dataFimConvenio;
		this.empresa = empresa;
	}
	
	public Convenio(){

}
}
