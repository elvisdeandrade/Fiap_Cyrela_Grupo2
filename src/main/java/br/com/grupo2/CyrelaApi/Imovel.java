package br.com.grupo2.CyrelaApi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {
    private long id;
	private String cidade;

    public Imovel(){}
    
	public Imovel(long id, String cidade) {
		this.id = id;
		this.cidade = cidade;
	}

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

    public void setId(long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

    public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
