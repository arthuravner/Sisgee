package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column (name="idPessoa", unique = true)
	 private int idPessoa;
	 
	 @Column(name="nome",length=100,nullable=false)
	 private String nome; 
	 	 
	 public int getIdPessoa() {
	  return idPessoa;
	 }

	 public String getNome() {
	  return nome;
	 }

	 public void setNome(String nome) {
	  this.nome = nome;
	 }
	 
	 @Override
	 public String toString() {
	  return "Pessoa [nome=" + nome + "]";
	 }

	 @Override
	 public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + idPessoa;
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
	  Pessoa other = (Pessoa) obj;
	  if (idPessoa != other.idPessoa)
	   return false;
	  return true;
	 } 
	
}
