package br.com.grupo2.CyrelaApi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.grupo2.CyrelaApi.models.Agendamento;

@RepositoryRestResource
public interface AgendamentoRepository extends CrudRepository<Agendamento, Long>{
    public List<Agendamento> findByDataVisitaAndHorarioVisitaAndCodigoCondominio(String dataVisitaAndHorario, String horarioVisita, String codigoCondominio);
}
