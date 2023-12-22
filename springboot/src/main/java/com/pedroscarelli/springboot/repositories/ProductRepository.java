package com.pedroscarelli.springboot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedroscarelli.springboot.models.*;

 
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

    
} 
