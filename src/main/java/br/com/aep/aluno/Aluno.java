package br.com.aep.aluno;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.aep.conceito.Conceito;

@Entity
public class Aluno {
	@Id
	private String id;
	private String nome;
	
	@ManyToMany(mappedBy = "alunos")
	private Set<Conceito> conceitos = new HashSet<>(); 
	
	public Aluno() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	@JsonIgnore
	public Set<Conceito> getConceitos() {
		return conceitos;
	}
}
