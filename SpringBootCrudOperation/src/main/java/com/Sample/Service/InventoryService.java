package com.Sample.Service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Sample.Entity.Product;
import com.Sample.Repository.InventoryRepository;

@Service
public class InventoryService {
	@Autowired
	private InventoryRepository repository;
	// to insertS
	public Product saveData(Product p) {
		Product p1 = repository.save(p);
		return p1;
	}
	//read all product data
	public List<Product> readAllProducts() {
		List<Product> all = repository.findAll();
		return all;
	}
	//method to delete a product
	public void deleteProduct(int id) {
		repository.deleteById(id);
	}
	
	//update a product
	public Product updateProduct(int id, Product np) {
		Optional<Product> temp = repository.findById(id);
		if(temp.isPresent()) {
			Product op = temp.get();
			op.setPname(np.getPname());
			op.setPqty(np.getPqty());
			op.setPprice(np.getPprice());
			return repository.save(op);
		}
		else {
			 throw new RuntimeException("product not found");
		}
	}
}
