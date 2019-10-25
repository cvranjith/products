package com.ofss.products;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping ("/hello")
	public String sayHello() {
		return "Hi OFSS Japac Microservices Interest group!";
	}
	
	@RequestMapping ("/products")
	public ArrayList<Product> getProducts( ) {
		
		ArrayList<Product> prds =  new ArrayList<Product>();

		
		
		Product p1 = new Product ("FCUBS","FLEXCUBE UniversalBanking", "14.2");
		Product p2 = new Product ("FCR","FLEXCUBE Retail Banking", "14.2");
		Product p3 = new Product ("FCIS","FLEXCUBE Investor Service","14.2");
		Product p4 = new Product ("OBP","Oracle Banking Platform","1.4");
		Product p5 = new Product ("ELCM","Enterprise Limits and Collateral","11.2");
	
		prds.add(p1);
		prds.add(p2);
		prds.add(p3);
		prds.add(p4);
		prds.add(p5);
		
		return prds;
		
		
		

	}
	
	@RequestMapping ("/products/{productID}")
	public Product getProduct(@PathVariable String productID) {
		ArrayList<Product> prds =  getProducts();
		Product p1 = new Product ();

		for (int i=0; i< prds.size();i++) {
			if (prds.get(i).getProductID().equals(productID)) {
				p1 = prds.get(i);
				break;
			}
		}
		return p1;		

	}
}
