package model.entity;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Pessoa {

	private String cpf;	
	private String nome;	
	private Date dt_nasc;
	
}
