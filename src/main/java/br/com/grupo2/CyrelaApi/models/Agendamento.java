package br.com.grupo2.CyrelaApi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento {
    private Long id;
    private String dataVisita;

    private String horarioVisita;
    private String email;
    private String codigoCondominio;
    private int duracao;
    private String condominio;

    public Agendamento(){}
    
    public Agendamento( String dataVisita, String horarioVisita, String email, String codigoCondominio, int duracao, String condominio) {
        this.dataVisita = dataVisita;
        this.horarioVisita = horarioVisita;
        this.email = email;
        this.codigoCondominio = codigoCondominio;
        this.duracao = duracao;
        this.condominio = condominio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataVisita() {
        return this.dataVisita;
    }

    public void setDataVisita(String dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getHorarioVisita() {
        return this.horarioVisita;
    }

    public void setHorarioVisita(String horarioVisita) {
        this.horarioVisita = horarioVisita;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoCondominio() {
        return this.codigoCondominio;
    }

    public void setCodigoCondominio(String codigoCondominio) {
        this.codigoCondominio = codigoCondominio;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCondominio() {
        return this.condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

}
