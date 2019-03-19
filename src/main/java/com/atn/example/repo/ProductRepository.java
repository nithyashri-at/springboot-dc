package com.atn.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atn.example.resources.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>  {

}
