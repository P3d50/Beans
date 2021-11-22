package com.p3d50.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BeansApplication {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Livro livro = factory.getBean(Livro.class);
		Autor autor = factory.getBean(Autor.class);

		autor.setNome("Eu");
		livro.setNome("EthicalHacking");
		livro.setCodigo("8080");
		livro.print();
		((AbstractApplicationContext)factory).close();


	}

}
