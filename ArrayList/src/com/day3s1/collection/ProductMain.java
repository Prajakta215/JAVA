package com.day3s1.collection;

import java.util.HashSet;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> products = new HashSet<>();
		
		products.add(new Product(01,"Maruti 800"));
		products.add(new Product(02,"Maruti Zen"));
		products.add(new Product(03,"Maruti Dezire"));
		products.add(new Product(04,"Maruti Alto"));
		
		//System.out.println(products);
		
		for (Product product: products) {
			System.out.println(product);
		}
	}

}
