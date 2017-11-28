package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Aluno{

	 @Id
	 @GeneratedValue
	 @Column (name="idAluno", unique = true)
	 private int idAluno;
		 
	 @Column (name="matricula",length=100,nullable=false)
	 private String matricula;
	 
	 @Column (name="situacao",length=100,nullable=false)
	 private String situacao;
	
	 @ManyToOne(optional=false)
	 @JoinColumn(name="idCurso")	 
	 private Curso curso;
	 
	 @OneToOne(optional = false)
	 @JoinColumn(name="idPessoa")	 
	 private Pessoa pessoa;

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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso (Curso curso) {
		this.curso = curso;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
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
	
	public String toString()
	{
		return pessoa.getNome();
	}
}
