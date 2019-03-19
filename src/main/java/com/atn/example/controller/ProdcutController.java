package com.atn.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atn.example.repo.ProductRepository;
import com.atn.example.resources.Product;

@RestController
@RequestMapping("/products")
public class ProdcutController {
	
	@Autowired
	ProductRepository repo;
	
	@GetMapping("/healthcheck")
	public String healthCheck() {
		return "Im running Dude";
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	
	@PostMapping
	public void addProduct(@RequestBody Product product){
		 repo.save(product);
	}
	
 
}
