package teste.com.daniel.aula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.com.daniel.aula.model.produto;

@RestController
public class helloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	@GetMapping("/produto")
	public String produto mostraProduto() {
		produto p = new produto();
		p.setNome("garrafa");
		p.setQtd(2);
		p.setValor(233);
		return produto;
	}

}
