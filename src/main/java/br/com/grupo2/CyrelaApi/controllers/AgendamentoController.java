package br.com.grupo2.CyrelaApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupo2.CyrelaApi.models.Agendamento;
import br.com.grupo2.CyrelaApi.repositories.AgendamentoRepository;

@RestController
@RequestMapping(value = "/api/v1/agendamentos")
public class AgendamentoController {
    @Autowired
    AgendamentoRepository repo;

    @RequestMapping(value = "/{dataVisita}/{horarioVisita}/{codigoCondominio}")
    public List<Agendamento> imoveis(@PathVariable("dataVisita") String dataVisita,
            @PathVariable("horarioVisita") String horarioVisita,
            @PathVariable("codigoCondominio") String codigoCondominio) {
        return repo.findByDataVisitaAndHorarioVisitaAndCodigoCondominio(dataVisita, horarioVisita, codigoCondominio);
    }

    @RequestMapping(value = "")
    public Iterable<Agendamento> imoveisAll() {
        return repo.findAll();
    }
}
