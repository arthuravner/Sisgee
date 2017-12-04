package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpresa;
	
	@Column(name="nomeEmpresa",length=255,nullable=true)
	private String nomeEmpresa;
	
	@ManyToOne(optional=true)
	@JoinColumn(name = "idAgenteIntegracao")
	private AgenteIntegracao agenteIntegracao;
	
	@Column(name="cnpjEmpresa",length=14,nullable=true)
	private String cnpjEmpresa;
	/**
	 * @return the id
	 */
	public int getIdEmpresa() {
		return idEmpresa;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idEmpresa = id;
	}
	/**
	 * @return the cnpjEmpresa
	 */
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	/**
	 * @param cnpjEmpresa the cnpjEmpresa to set
	 */
	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}
	/**
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	/**
	 * @return the idAgenteIntegracao
	 */
	public AgenteIntegracao getAgenteIntegracao() {
		return agenteIntegracao;
	}
	/**
	 * @param idAgenteIntegracao the idAgenteIntegracao to set
	 */
	public void setAgenteIntegracao(AgenteIntegracao agenteIntegracao) {
		this.agenteIntegracao = agenteIntegracao;
	}
	public Empresa(String nomeEmpresa, AgenteIntegracao agenteIntegracao, String cnpjEmpresa) {
		
		this.nomeEmpresa = nomeEmpresa;
		this.agenteIntegracao = agenteIntegracao;
		this.cnpjEmpresa = cnpjEmpresa;
	}
	
	public Empresa() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmpresa;
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
		Empresa other = (Empresa) obj;
		if (idEmpresa != other.idEmpresa)
			return false;
		return true;
	}
}
