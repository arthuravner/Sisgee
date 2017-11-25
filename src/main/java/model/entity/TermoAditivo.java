package model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class TermoAditivo {

	 @Id
	 @GeneratedValue
	 @Column (name="idTermoAditivo", unique = true)
	 private int idTermoAditivo;
		 
	 @Column (name="dataFimTermoAditivo",nullable=false)
	 private Date dataFimTermoAditivo;
	 
	 @Column (name="cargaHorariaTermoAditivo",nullable=true)
	 private int cargaHorariaTermoAditivo;
	 
	 @Column (name="valorBolsaTermoAditivo",nullable=true)
	 private float valorBolsaTermoAditivo;
	
	 @Column (name="enderecoTermoAditivo",length=255, nullable=true)
	 private String enderecoTermoAditivo;
	 
	 @Column (name="dataFimTermoAditivo",length=10, nullable=true)
	 private String numeroEnderecoTermoAditivo;
	 
	 @Column (name="dataFimTermoAditivo",length=255, nullable=true)
	 private String complementoEnderecoTermoEstagio;
	 
	 @Column (name="bairroEnderecoTermoAditivo",length=150 ,nullable=true)
	 private String bairroEnderecoTermoAditivo;

	 @Column (name="cepEnderecoTermoAditivo",length=15 ,nullable=true)
	 private String cepEnderecoTermoAditivo;
	 
	 @Column (name="cidadeEnderecoTermoAditivo",length=150 ,nullable=true)
	 private String cidadeEnderecoTermoAditivo;
	 
	 @Column (name="estadoEnderecoTermoAditivo",length=2 ,nullable=true)
	 private String estadoEnderecoTermoAditivo;
	 
	 @OneToOne(optional = false)
	 @JoinColumn(name="TermoEstagio")
	 private TermoEstagio idTermoEstagio;

	public Date getDataFimTermoAditivo() {
		return dataFimTermoAditivo;
	}

	public void setDataFimTermoAditivo(Date dataFimTermoAditivo) {
		this.dataFimTermoAditivo = dataFimTermoAditivo;
	}

	public int getCargaHorariaTermoAditivo() {
		return cargaHorariaTermoAditivo;
	}

	public void setCargaHorariaTermoAditivo(int cargaHorariaTermoAditivo) {
		this.cargaHorariaTermoAditivo = cargaHorariaTermoAditivo;
	}

	public float getValorBolsaTermoAditivo() {
		return valorBolsaTermoAditivo;
	}

	public void setValorBolsaTermoAditivo(float valorBolsaTermoAditivo) {
		this.valorBolsaTermoAditivo = valorBolsaTermoAditivo;
	}

	public String getEnderecoTermoAditivo() {
		return enderecoTermoAditivo;
	}

	public void setEnderecoTermoAditivo(String enderecoTermoAditivo) {
		this.enderecoTermoAditivo = enderecoTermoAditivo;
	}

	public String getNumeroEnderecoTermoAditivo() {
		return numeroEnderecoTermoAditivo;
	}

	public void setNumeroEnderecoTermoAditivo(String numeroEnderecoTermoAditivo) {
		this.numeroEnderecoTermoAditivo = numeroEnderecoTermoAditivo;
	}

	public String getComplementoEnderecoTermoEstagio() {
		return complementoEnderecoTermoEstagio;
	}

	public void setComplementoEnderecoTermoEstagio(String complementoEnderecoTermoEstagio) {
		this.complementoEnderecoTermoEstagio = complementoEnderecoTermoEstagio;
	}

	public String getBairroEnderecoTermoAditivo() {
		return bairroEnderecoTermoAditivo;
	}

	public void setBairroEnderecoTermoAditivo(String bairroEnderecoTermoAditivo) {
		this.bairroEnderecoTermoAditivo = bairroEnderecoTermoAditivo;
	}

	public String getCepEnderecoTermoAditivo() {
		return cepEnderecoTermoAditivo;
	}

	public void setCepEnderecoTermoAditivo(String cepEnderecoTermoAditivo) {
		this.cepEnderecoTermoAditivo = cepEnderecoTermoAditivo;
	}

	public String getCidadeEnderecoTermoAditivo() {
		return cidadeEnderecoTermoAditivo;
	}

	public void setCidadeEnderecoTermoAditivo(String cidadeEnderecoTermoAditivo) {
		this.cidadeEnderecoTermoAditivo = cidadeEnderecoTermoAditivo;
	}

	public String getEstadoEnderecoTermoAditivo() {
		return estadoEnderecoTermoAditivo;
	}

	public void setEstadoEnderecoTermoAditivo(String estadoEnderecoTermoAditivo) {
		this.estadoEnderecoTermoAditivo = estadoEnderecoTermoAditivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTermoAditivo;
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
		TermoAditivo other = (TermoAditivo) obj;
		if (idTermoAditivo != other.idTermoAditivo)
			return false;
		return true;
	}
}
