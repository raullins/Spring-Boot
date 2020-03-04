package br.ufpb.dcx.dsc.projeto1;

import org.springframework.stereotype.Component;

@Component

public class ServicoProdutos {
	
	public ServicoProdutos() {
		System.out.println("Criando ServicoProdutos");
	}
	
	public String ola() {
		return "Olá mundo!";
	}
	
	public void ola2() {
		System.out.println("ServicoProdutos.ola()");
	}

}
