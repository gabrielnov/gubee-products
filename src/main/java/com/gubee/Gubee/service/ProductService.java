package com.gubee.Gubee.service;

import com.gubee.Gubee.model.Product;
import com.gubee.Gubee.model.Stack;
import com.gubee.Gubee.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public List<Product> findProducts(ArrayList<String> stacks, String target) {

        Collection<Stack> stackCollection = new ArrayList<>();
        stacks.forEach(s -> {
            stackCollection.add(new Stack(s));
        });

        return productRepository.findByStackIn(stackCollection);
    }

    public void newProduct(Product product){
        product.setRegisterDate(LocalDateTime.now());
        productRepository.save(product);
    }
}
