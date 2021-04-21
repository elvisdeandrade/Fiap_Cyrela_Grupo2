package br.com.grupo2.CyrelaApi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.grupo2.CyrelaApi.models.Imovel;

@RepositoryRestResource
public interface ImovelRepository extends CrudRepository<Imovel, Long>{
    public List<Imovel> findByCidadeAndLocalizacao(String cidade, String localizacao);
}


