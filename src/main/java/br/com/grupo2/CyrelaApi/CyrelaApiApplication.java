package br.com.grupo2.CyrelaApi;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.grupo2.CyrelaApi.models.Agendamento;
import br.com.grupo2.CyrelaApi.models.Imovel;
import br.com.grupo2.CyrelaApi.repositories.AgendamentoRepository;
import br.com.grupo2.CyrelaApi.repositories.ImovelRepository;

@SpringBootApplication
public class CyrelaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyrelaApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner seed(ImovelRepository imoveisRep, AgendamentoRepository agRepo) {
		return (args) -> {
			Imovel imovel = new Imovel( "SP", "2B", "2", "Residencial Alfa Plus", 90,new BigDecimal(600000L) ,"ZN");

			imoveisRep.save(imovel);

			imovel = new Imovel( "SP", "C3", "1", "Residencial Italia", 90,new BigDecimal(800000L) ,"ZS");

			imoveisRep.save(imovel);

			imovel = new Imovel( "MG", "A4", "3", "Residencial Alfa Genesis", 90,new BigDecimal(750000L) ,"ZL");

			imoveisRep.save(imovel);

			imovel = new Imovel( "RJ", "7B", "6", "Residencial Tucuruvi", 90,new BigDecimal(690000L) ,"ZO");

			imoveisRep.save(imovel);

			Agendamento ag = new Agendamento("2021-04-21", "0830", "fulano@hotmail.com", "A456", 1, "Residencial Alfa Genesis");

			agRepo.save(ag);

			ag = new Agendamento("2021-04-01", "0930", "ana.paula@gmail.com", "A488", 1, "Residencial Italia");
			agRepo.save(ag);

			ag = new Agendamento("2021-05-16", "1700", "joao-henrique@outlook.com", "A457", 1, "Residencial Alfa Plus");
			agRepo.save(ag);

			ag = new Agendamento("2021-08-12", "1245", "marcos.felipe@yahoo.com.br", "A423", 1, "Residencial Tucuruvi");
			agRepo.save(ag);
		};
	}
}
