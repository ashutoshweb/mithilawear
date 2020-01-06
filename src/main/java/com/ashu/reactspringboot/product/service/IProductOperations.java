package com.ashu.reactspringboot.product.service;

import com.ashu.reactspringboot.product.model.Product;

import java.util.List;

public interface IProductOperations {

    public List getProducts();

    public Product getProductById(Long id );


}
