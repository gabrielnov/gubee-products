package com.gubee.Gubee.controller;

import com.gubee.Gubee.model.Product;
import com.gubee.Gubee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findProduct(@RequestParam(required = false) ArrayList<String> stacks, @RequestParam(required = false) String target){

        return ResponseEntity.ok().body(productService.findProducts(stacks, target));
    }

    @PostMapping
    public ResponseEntity<?> newProduct(@RequestBody Product product){
        productService.newProduct(product);
        return ResponseEntity.noContent().build();
    }
}
