package com.Sample.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Entity.Product;

@Repository
public interface InventoryRepository extends JpaRepository<Product,Integer>{

}
