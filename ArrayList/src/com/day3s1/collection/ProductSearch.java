package com.day3s1.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> p=new HashSet<>();
		
		Product Maruti = new Product(001,"Maruti 800");
		Product MarutiZ = new Product(002,"Maruti Zen");
		Product MarutiD = new Product(003,"Maruti Dezire");
		Product MarutiA = new Product(004,"Maruti Alto");
		
		p.add(Maruti);
		p.add(MarutiZ);
		p.add(MarutiD);
		p.add(MarutiA);
		
		System.out.println(p);
		
		long searchProductId = 002;
		for(Product products: p) {
			if(products.getProductId() == searchProductId) {
				System.out.println("Found Product : " + products.getProductName());
				break;
			}
		}
		
		long removeProductID = 003;
		Iterator<Product> itr=p.iterator();
		while(itr.hasNext()) {
			Product product=itr.next();
		if(product.getProductId() == removeProductID) {
			itr.remove();
			
			System.out.println("Removed Product: " + product.getProductName());
			
			break;
		}
		
		}
		
		System.out.println(p);
		
	}

}
