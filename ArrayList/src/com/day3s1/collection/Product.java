package com.day3s1.collection;

import java.util.Objects;

public class Product {
	
		long productId;
		String productName;
		
		public Product() {
			
		}
		
		
		public Product(long productId, String productName) {
			super();
			this.productId = productId;
			this.productName = productName;
		}
		
		
		public long getProductId() {
			return productId;
		}
		public void setProductId(long productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}


		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(productId, productName);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return productId == other.productId && Objects.equals(productName, other.productName);
		}

		
		
}


