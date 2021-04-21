package br.com.grupo2.CyrelaApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImoveisController {
    
    @GetMapping("/imoveis")
	public Imovel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Imovel(1,"São Paulo");
	}
}
