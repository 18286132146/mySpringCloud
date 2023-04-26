package com.miguan.springcloud.service;

import com.miguan.springcloud.entities.Product;

import java.util.List;

public interface ProductService {
    boolean add(Product product);
    Product get(Long pid);
    List<Product> list();
}
