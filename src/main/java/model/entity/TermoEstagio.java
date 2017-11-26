package model.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class TermoEstagio {
	@Id
	@GeneratedValue
	private int idTermoEstagio;
	
	private Date dataInicioTermoEstagio;
	
	private Date dataFimTermoEstagio;
	
	private Date dataRescisaoTermoEstagio;
	
	@Column(name="situacaoTermoEstagio",length=25,nullable=true)
	private String situacaoTermoEstagio;
	
	private int cargaHorariaTermoEstagio;
	
	private float valorBolsa;
	
	@Column(name="enderecoTermoEstagio",length=255,nullable=true)
	private String enderecoTermoEstagio; 
	
	@Column(name="numeroEnderecoTermoEstagio",length=10,nullable=true)
	private String numeroEnderecoTermoEstagio;
	
	@Column(name="complementoEnderecoTermoEstagio",length=255,nullable=true)
	private String complementoEnderecoTermoEstagio;
	
	@Column(name="bairroEnderecoTermoEstagio",length=150,nullable=true)
	private String bairroEnderecoTermoEstagio;
	
	@Column(name="cepEnderecoTermoEstagio",length=15,nullable=true)
	private String cepEnderecoTermoEstagio;
	
	@Column(name="cidadeEnderecoTermoEstagio",length=150,nullable=true)
	private String cidadeEnderecoTermoEstagio;
	
	@Column(name="estadoEnderecoTermoEstagio",length=2,nullable=true)
	private String estadoEnderecoTermoEstagio;
	
	private int eEstagioObrigatorio;
	
	@OneToMany()
	@JoinColumn(name="idAluno")
	private int idProfessorOrientador;
	
	@OneToOne(optional = false)
	@JoinColumn(name="idAluno")
	private int idAluno;
	
	@OneToMany()
	@JoinColumn(name="idAluno")
	private int idConvenio;

	public int getIdTermoEstagio() {
		return idTermoEstagio;
	}

	public void setIdTermoEstagio(int idTermoEstagio) {
		this.idTermoEstagio = idTermoEstagio;
	}

	public Date getDataInicioTermoEstagio() {
		return dataInicioTermoEstagio;
	}

	public void setDataInicioTermoEstagio(Date dataInicioTermoEstagio) {
		this.dataInicioTermoEstagio = dataInicioTermoEstagio;
	}

	public Date getDataFimTermoEstagio() {
		return dataFimTermoEstagio;
	}

	public void setDataFimTermoEstagio(Date dataFimTermoEstagio) {
		this.dataFimTermoEstagio = dataFimTermoEstagio;
	}

	public Date getDataRescisaoTermoEstagio() {
		return dataRescisaoTermoEstagio;
	}

	public void setDataRescisaoTermoEstagio(Date dataRescisaoTermoEstagio) {
		this.dataRescisaoTermoEstagio = dataRescisaoTermoEstagio;
	}

	public String getSituacaoTermoEstagio() {
		return situacaoTermoEstagio;
	}

	public void setSituacaoTermoEstagio(String situacaoTermoEstagio) {
		this.situacaoTermoEstagio = situacaoTermoEstagio;
	}

	public int getCargaHorariaTermoEstagio() {
		return cargaHorariaTermoEstagio;
	}

	public void setCargaHorariaTermoEstagio(int cargaHorariaTermoEstagio) {
		this.cargaHorariaTermoEstagio = cargaHorariaTermoEstagio;
	}

	public float getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(float valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

	public String getEnderecoTermoEstagio() {
		return enderecoTermoEstagio;
	}

	public void setEnderecoTermoEstagio(String enderecoTermoEstagio) {
		this.enderecoTermoEstagio = enderecoTermoEstagio;
	}

	public String getNumeroEnderecoTermoEstagio() {
		return numeroEnderecoTermoEstagio;
	}

	public void setNumeroEnderecoTermoEstagio(String numeroEnderecoTermoEstagio) {
		this.numeroEnderecoTermoEstagio = numeroEnderecoTermoEstagio;
	}

	public String getComplementoEnderecoTermoEstagio() {
		return complementoEnderecoTermoEstagio;
	}

	public void setComplementoEnderecoTermoEstagio(String complementoEnderecoTermoEstagio) {
		this.complementoEnderecoTermoEstagio = complementoEnderecoTermoEstagio;
	}

	public String getBairroEnderecoTermoEstagio() {
		return bairroEnderecoTermoEstagio;
	}

	public void setBairroEnderecoTermoEstagio(String bairroEnderecoTermoEstagio) {
		this.bairroEnderecoTermoEstagio = bairroEnderecoTermoEstagio;
	}

	public String getCepEnderecoTermoEstagio() {
		return cepEnderecoTermoEstagio;
	}

	public void setCepEnderecoTermoEstagio(String cepEnderecoTermoEstagio) {
		this.cepEnderecoTermoEstagio = cepEnderecoTermoEstagio;
	}

	public String getCidadeEnderecoTermoEstagio() {
		return cidadeEnderecoTermoEstagio;
	}

	public void setCidadeEnderecoTermoEstagio(String cidadeEnderecoTermoEstagio) {
		this.cidadeEnderecoTermoEstagio = cidadeEnderecoTermoEstagio;
	}

	public String getEstadoEnderecoTermoEstagio() {
		return estadoEnderecoTermoEstagio;
	}

	public void setEstadoEnderecoTermoEstagio(String estadoEnderecoTermoEstagio) {
		this.estadoEnderecoTermoEstagio = estadoEnderecoTermoEstagio;
	}

	public int geteEstagioObrigatorio() {
		return eEstagioObrigatorio;
	}

	public void seteEstagioObrigatorio(int eEstagioObrigatorio) {
		this.eEstagioObrigatorio = eEstagioObrigatorio;
	}

	public int getIdProfessorOrientador() {
		return idProfessorOrientador;
	}

	public void setIdProfessorOrientador(int idProfessorOrientador) {
		this.idProfessorOrientador = idProfessorOrientador;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTermoEstagio;
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
		TermoEstagio other = (TermoEstagio) obj;
		if (idTermoEstagio != other.idTermoEstagio)
			return false;
		return true;
	}
	
	
}