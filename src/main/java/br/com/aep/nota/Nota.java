package br.com.aep.nota;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.aep.conceito.Conceito;

@Entity
public class Nota {
	@Id
	private String id;
	private Double valor;
	
	@OneToOne(mappedBy = "nota")
	private Conceito conceito;
	
	public Nota() {
		this.id = UUID.randomUUID().toString();
		/*if(this.valor<0 || this.valor>10) {
			throw new RuntimeException("Nota informada é inválida");
		}*/
	}

	public String getId() {
		return id;
	}

	public Double getValor() {
		return valor;
	}
	@JsonIgnore
	public Conceito getConceito() {
		return conceito;
	}
}
