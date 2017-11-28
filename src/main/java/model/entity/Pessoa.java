package model.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {

	 @Id
	 @GeneratedValue
	 @Column (name="idPessoa", unique = true)
	 private int idPessoa;
	 
	 @Column (name="cpf",length=14,nullable=false)
	 private String cpf; 
	 @Column(name="nome",length=100,nullable=false)
	 private String nome; 
	 
	 @Column(name="dataNascimento",nullable=true)
	 private Date dataNascimento;
	 
	 @Column(name="tipo_endereco",length=100,nullable=true)
	 private String tipo_endereco;
	 
	 @Column(name="endereco",length=255,nullable=true)
	 private String endereco;
	 
	 @Column(name="numeroEndereco",length=10,nullable=true)
	 private String numeroEndereco;
	 
	 @Column(name="complementoEndereco",length=255,nullable=true)
	 private String complementoEndereco;
	 
	 @Column(name="bairroEndereco",length=10,nullable=true)
	 private String bairroEndereco;
	 
	 @Column(name="cepEndereco",length=15,nullable=true)
	 private String cepEndereco;
	 
	 @Column(name="distritoEndereco",length=150,nullable=true)
	 private String distritoEndereco;
	 
	 @Column(name="cidadeEndereco",length=150,nullable=true)
	 private String cidadeEndereco;
	 
	 @Column(name="estadoEndereco",length=2,nullable=true)
	 private String estadoEndereco;
	 
	 @Column(name="paisEndereco",length=100,nullable=true)
	 private String paisEndereco;
	 
	 @Column(name="email",length=150,nullable=true)
	 private String email;
	 
	 @Column(name="ddiResidencial",length=10,nullable=true)
	 private int ddiResidencial;
	 
	 @Column(name="dddResidencial",nullable=true)
	 private int dddResidencial;
	 
	 @Column(name="telefoneResidencial",length=30,nullable=true)
	 private String telefoneResidencial;
	 
	 @Column(name="ddiComercial",nullable=true)
	 private int ddiComercial;
	 
	 @Column(name="dddComercial",nullable=true)
	 private int dddComercial;
	 
	 @Column(name="telefoneComercial",length=30,nullable=true)
	 private String telefoneComercial;
	 
	 @Column(name="ddiCelular",nullable=true)
	 private int ddiCelular;
	 
	 @Column(name="dddCelular",nullable=true)
	 private int dddCelular; 
	 
	 @Column(name="telefoneCelular",length=30,nullable=true)
	 private String telefoneCelular;

	 
	 
	 public int getIdPessoa() {
	  return idPessoa;
	 }

	 public String getCpf() {
	  return cpf;
	 }

	 public void setCpf(String cpf) {
	  this.cpf = cpf;
	 }

	 public String getNome() {
	  return nome;
	 }

	 public void setNome(String nome) {
	  this.nome = nome;
	 }

	 public Date getDataNascimento() {
	  return dataNascimento;
	 }

	 public void setDataNascimento(Date dataNascimento) {
	  this.dataNascimento = dataNascimento;
	 }

	 public String getTipo_endereco() {
	  return tipo_endereco;
	 }

	 public void setTipo_endereco(String tipo_endereco) {
	  this.tipo_endereco = tipo_endereco;
	 }

	 public String getEndereco() {
	  return endereco;
	 }

	 public void setEndereco(String endereco) {
	  this.endereco = endereco;
	 }

	 public String getNumeroEndereco() {
	  return numeroEndereco;
	 }

	 public void setNumeroEndereco(String numeroEndereco) {
	  this.numeroEndereco = numeroEndereco;
	 }

	 public String getComplementoEndereco() {
	  return complementoEndereco;
	 }

	 public void setComplementoEndereco(String complementoEndereco) {
	  this.complementoEndereco = complementoEndereco;
	 }

	 public String getBairroEndereco() {
	  return bairroEndereco;
	 }

	 public void setBairroEndereco(String bairroEndereco) {
	  this.bairroEndereco = bairroEndereco;
	 }

	 public String getCepEndereco() {
	  return cepEndereco;
	 }

	 public void setCepEndereco(String cepEndereco) {
	  this.cepEndereco = cepEndereco;
	 }

	 public String getDistritoEndereco() {
	  return distritoEndereco;
	 }

	 public void setDistritoEndereco(String distritoEndereco) {
	  this.distritoEndereco = distritoEndereco;
	 }

	 public String getCidadeEndereco() {
	  return cidadeEndereco;
	 }

	 public void setCidadeEndereco(String cidadeEndereco) {
	  this.cidadeEndereco = cidadeEndereco;
	 }

	 public String getEstadoEndereco() {
	  return estadoEndereco;
	 }

	 public void setEstadoEndereco(String estadoEndereco) {
	  this.estadoEndereco = estadoEndereco;
	 }

	 public String getPaisEndereco() {
	  return paisEndereco;
	 }

	 public void setPaisEndereco(String paisEndereco) {
	  this.paisEndereco = paisEndereco;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }

	 public int getDdiResidencial() {
	  return ddiResidencial;
	 }

	 public void setDdiResidencial(int ddiResidencial) {
	  this.ddiResidencial = ddiResidencial;
	 }

	 public int getDddResidencial() {
	  return dddResidencial;
	 }

	 public void setDddResidencial(int dddResidencial) {
	  this.dddResidencial = dddResidencial;
	 }

	 public String getTelefoneResidencial() {
	  return telefoneResidencial;
	 }

	 public void setTelefoneResidencial(String telefoneResidencial) {
	  this.telefoneResidencial = telefoneResidencial;
	 }

	 public int getDdiComercial() {
	  return ddiComercial;
	 }

	 public void setDdiComercial(int ddiComercial) {
	  this.ddiComercial = ddiComercial;
	 }

	 public int getDddComercial() {
	  return dddComercial;
	 }

	 public void setDddComercial(int dddComercial) {
	  this.dddComercial = dddComercial;
	 }

	 public String getTelefoneComercial() {
	  return telefoneComercial;
	 }

	 public void setTelefoneComercial(String telefoneComercial) {
	  this.telefoneComercial = telefoneComercial;
	 }

	 public int getDdiCelular() {
	  return ddiCelular;
	 }

	 public void setDdiCelular(int ddiCelular) {
	  this.ddiCelular = ddiCelular;
	 }

	 public int getDddCelular() {
	  return dddCelular;
	 }

	 public void setDddCelular(int dddCelular) {
	  this.dddCelular = dddCelular;
	 }

	 public String getTelefoneCelular() {
	  return telefoneCelular;
	 }

	 public void setTelefoneCelular(String telefoneCelular) {
	  this.telefoneCelular = telefoneCelular;
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
