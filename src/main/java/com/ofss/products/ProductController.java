package com.ofss.products;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping ("/hello")
	public String Hello() {
		return "Hi OFSS Japac Microserices Interest group!";
	}
	
	@RequestMapping ("/products")
	public ArrayList<Product> getProducts( ) {
		
		ArrayList<Product> prds =  new ArrayList<Product>();

		
		
		Product p1 = new Product ("FCUBS","FLEXCUBE Universal Banking", "14.2");
		Product p2 = new Product ("FCR","FLEXCUBE Retail Banking", "11.2");
		Product p3 = new Product ("OBVAM","Oracle Banking VAM", "14.2");
		
		prds.add(p1);
		prds.add(p2);
		prds.add(p3);
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
