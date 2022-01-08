package com.miguan.springcloud.controller;

import com.miguan.entities.Product;
import com.miguan.springcloud.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
 @Autowired
 private ProductService  productService;

 @RequestMapping(value = "/product/add",method = RequestMethod.POST)
 public boolean add(@RequestBody Product product){
     return productService.add(product);

 }
 @RequestMapping(value = "/product/get/{id}",method = RequestMethod.GET)
 public Product get(@PathVariable Long id){
        return productService.get(id);

    }
 @RequestMapping(value = "/product/list",method = RequestMethod.GET)
 public List<Product> list(){
        return productService.list();

    }

}
