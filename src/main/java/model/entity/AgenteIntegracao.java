package model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AgenteIntegracao {

	 @Id
	 @GeneratedValue
	 @Column (name="idAgenteIntegracao", unique = true)
	 private int idAgenteIntegracao;
		 
	 @Column (name="cnpjAgenteIntegracao",length=14,nullable=false)
	 private String cnpjAgenteIntegracao;
	 
	 @Column (name="nomeAgenteIntegracao",length=100,nullable=false)
	 private String nomeAgenteIntegracao;
	 
	 

	public String getCnpjAgenteIntegracao() {
		return cnpjAgenteIntegracao;
	}

	public void setCnpjAgenteIntegracao(String cnpjAgenteIntegracao) {
		this.cnpjAgenteIntegracao = cnpjAgenteIntegracao;
	}

	public String getNomeAgenteIntegracao() {
		return nomeAgenteIntegracao;
	}

	public void setNomeAgenteIntegracao(String nomeAgenteIntegracao) {
		this.nomeAgenteIntegracao = nomeAgenteIntegracao;
	}

	@Override
	public String toString() {
		return "AgenteIntegracao [cnpjAgenteIntegracao=" + cnpjAgenteIntegracao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAgenteIntegracao;
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
		AgenteIntegracao other = (AgenteIntegracao) obj;
		if (idAgenteIntegracao != other.idAgenteIntegracao)
			return false;
		return true;
	}
}
