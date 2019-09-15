package br.com.aep.conceito;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.com.aep.aluno.Aluno;
import br.com.aep.avaliacao.Avaliacao;
import br.com.aep.nota.Nota;

@Entity
public class Conceito {
	@Id
	private String id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Nota nota;
	
	@ManyToMany
	private Set<Avaliacao> avaliacoes = new HashSet<>();
	
	@ManyToMany
	private Set<Aluno> alunos = new HashSet<>();
	
	public Conceito() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}

	public Nota getNota() {
		return nota;
	}

	public Set<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}
}
