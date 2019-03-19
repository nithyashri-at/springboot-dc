package com.atn.example.resources;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	Integer prodcutid;
	String productname;
	String productdesc;
	double price;
	int availablequantity;

}
