package br.ufpb.dcx.dsc.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Projeto1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Projeto1Application.class, args);
		ControladorProdutos controlarProdutos = context.getBean(ControladorProdutos.class);
		controlarProdutos.ola();
		
		//ControladorProdutos controlarProdutosB = context.getBean(ControladorProdutos.class);
		//controlarProdutosB.ola();
	}

}
 