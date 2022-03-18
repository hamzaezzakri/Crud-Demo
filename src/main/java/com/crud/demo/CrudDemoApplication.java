package com.crud.demo;

import com.crud.demo.models.Produit;
import com.crud.demo.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class CrudDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(CrudDemoApplication.class, args);

	}

	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public void run(String... args) throws Exception {

		Produit p1 = new Produit();
		p1.setDesignation("lenovo T440s");
		p1.setPrix(3500);
		p1.setQuantite(125);
		produitRepository.save(p1);

	}
}
