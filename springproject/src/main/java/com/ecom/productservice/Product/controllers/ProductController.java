package com.ecom.productservice.Product.controllers;


import com.ecom.productservice.Product.dto.ProductRequestDTO;
import com.ecom.productservice.Product.models.Category;
import com.ecom.productservice.Product.models.Product;
import com.ecom.productservice.Product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("/products")
    public List<Product> getallProducts(){
        return new ArrayList<>();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){

        return productService.getSingleProduct(id);
    }

    @GetMapping("/products/categories")
    public List<Category> getallCategories(){
        return new ArrayList<>();
    }

    @GetMapping("/products/category/{id}")
    public List<Product> getAllProductInCategory(@PathVariable("id") Long id){

        return new ArrayList<>();
    }

    @PostMapping("/products")
    public Product addProducts(@RequestBody ProductRequestDTO requestDTO){

        return new Product();
    }

    @PatchMapping("/products/{id}")
    public Product updateProducts(
            @PathVariable("id") Long id,
            @RequestBody ProductRequestDTO requestDTO){

        return new Product();
    }

    @DeleteMapping("/products/{id}")
    public boolean deleteProducts(
            @PathVariable("id") Long id){

        return true;
    }


 }
