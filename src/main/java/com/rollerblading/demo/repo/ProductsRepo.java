package com.rollerblading.demo.repo;

import com.rollerblading.demo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductsRepo extends JpaRepository<Products, Integer>{

}
