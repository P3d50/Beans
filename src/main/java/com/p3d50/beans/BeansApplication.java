package com.p3d50.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansApplication {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("EthicalHacking");
		livro.setCodigo("8080");

	}

}
