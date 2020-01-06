package com.ashu.reactspringboot.product.service;

import com.ashu.reactspringboot.IProductService;
import com.ashu.reactspringboot.product.model.Product;
import com.ashu.reactspringboot.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostGressProductService implements IProductOperations {

    @Autowired
    ProductRepository iProductRepository;


    @Override
    public List getProducts() {
        return iProductRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return iProductRepository.findByProductId(id);
    }
}
