package com.miguan.springcloud.Service;

import com.miguan.entities.Product;

import java.util.List;

public interface ProductService {
    boolean add(Product product);
    Product get(Long pid);
    List<Product> list();
}
