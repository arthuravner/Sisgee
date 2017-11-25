package model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sun.jna.platform.unix.X11.Cursor;

public class Aluno {

	 @Id
	 @GeneratedValue
	 @Column (name="idAluno", unique = true)
	 private int idAluno;
		 
	 @Column (name="matricula",length=100,nullable=false)
	 private String matricula;
	 
	 @Column (name="situacao",length=100,nullable=false)
	 private String situacao;
	
	 @OneToOne(optional = false)
	 @JoinColumn(name="Curso")
	 private Curso idCurso;
	 
	 @OneToOne(optional = false)
	 @JoinColumn(name="Pessoa")
	 private Pessoa idPessoa;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Curso getIdCurso() {
		return idCurso;
	}

	public Pessoa getIdPessoa() {
		return idPessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAluno;
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
		Aluno other = (Aluno) obj;
		if (idAluno != other.idAluno)
			return false;
		return true;
	}
}
