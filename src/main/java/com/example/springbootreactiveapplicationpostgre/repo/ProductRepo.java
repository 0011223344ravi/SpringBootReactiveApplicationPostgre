package com.example.springbootreactiveapplicationpostgre.repo;

import com.example.springreactivecrud.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepo extends ReactiveCrudRepository<Product,Integer> {
}
