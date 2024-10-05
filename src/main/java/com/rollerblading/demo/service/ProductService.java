package com.rollerblading.demo.service;

import com.rollerblading.demo.model.Products;
import com.rollerblading.demo.repo.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductsRepo productRepo;

    @Autowired
    public ProductService(ProductsRepo productsrepo) {
        this.productRepo = productsrepo;
    }

    public List<Products> getAllProducts(){
        return productRepo.findAll();
    }

//    public ResponseEntity<Object> createRollerblade(Products rollerblade){
//        rollerbladesRepo.save(rollerblade);
//        return new ResponseEntity<>(rollerblade, HttpStatus.CREATED);
//    }
}
