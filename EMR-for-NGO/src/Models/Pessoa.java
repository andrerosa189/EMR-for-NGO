package Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="pessoa")
public class Pessoa {

	@Id
	private Long id ;
	
	private String nome ;
	
	private Date data ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
