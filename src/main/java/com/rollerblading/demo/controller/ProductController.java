package com.rollerblading.demo.controller;

import com.rollerblading.demo.model.Products;
import com.rollerblading.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Rest API layer - Controller. uses service class to get what it wants, and giving it back to the API layer
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Products>> getAllRollerblades(){
        return new ResponseEntity<List<Products>>(productService.getAllProducts(), HttpStatus.OK);
    }

//    @PostMapping("/")
//    public ResponseEntity<Object> createRollerblade(@RequestBody Products product){
//        return productService.createProduct(product);
//    }
}
