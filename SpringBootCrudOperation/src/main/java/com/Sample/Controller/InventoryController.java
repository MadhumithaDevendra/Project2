package com.Sample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.Entity.Product;
import com.Sample.Service.InventoryService;

@RestController
@RequestMapping("/app")
public class InventoryController {
	@Autowired
	private InventoryService service;
	//webservices/ rest API
	// webservices for inser
	@PostMapping("/insert")
	public ResponseEntity<Product> saveData(@RequestBody Product p) {
		Product p1 = service.saveData(p);
		return ResponseEntity.ok(p1);
	}
	//webservice for read all products
	@GetMapping("/readall")
	public List<Product> readAllProducts() {
		List<Product> allProducts = service.readAllProducts();
		return allProducts;
	}
	//delete 1 product
	@DeleteMapping("/delete/{pno}")
	public void deleteOneProduct(@PathVariable int pno) {
		service.deleteProduct(pno);
	}
	//updating 1 product
	@PutMapping("/update/{pno}")
	public Product updateProduct(@PathVariable int pno,@RequestBody Product np) {
		Product updateProduct = service.updateProduct(pno, np);
		return updateProduct;
	}
}
