package com.gubee.Gubee.repository;

import com.gubee.Gubee.model.Product;
import com.gubee.Gubee.model.Stack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

     List<Product> findDistinctByStackInAndTarget(ArrayList<String> stacks, String target);
}
