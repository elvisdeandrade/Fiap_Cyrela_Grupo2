package br.com.grupo2.CyrelaApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupo2.CyrelaApi.models.Imovel;
import br.com.grupo2.CyrelaApi.repositories.ImovelRepository;

@RestController
@RequestMapping(value = "/api/v1/imoveis")
public class ImoveisController {
	@Autowired
	ImovelRepository repo;

	@RequestMapping(value = "/{cidade}/{localizacao}")
	public List<Imovel> imoveis(@PathVariable("cidade") String cidade,@PathVariable("localizacao") String localizacao) {
		return repo.findByCidadeAndLocalizacao(cidade, localizacao);
	}

	@RequestMapping(value = "")
	public Iterable<Imovel> imoveisAll() {
		return repo.findAll();
	}
}
