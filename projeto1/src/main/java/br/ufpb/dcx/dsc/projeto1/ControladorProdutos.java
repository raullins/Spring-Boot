package br.ufpb.dcx.dsc.projeto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@Scope(value = "prototype")
public class ControladorProdutos {
	
	@Autowired
	private ServicoProdutos servicoproduto;

	public ControladorProdutos() {
		System.out.println("Criando ControladorDeProdutos");
	}
	
	@RequestMapping("/ola")
	@ResponseBody
	public String ola() {
		return servicoproduto.ola();
	}

}
