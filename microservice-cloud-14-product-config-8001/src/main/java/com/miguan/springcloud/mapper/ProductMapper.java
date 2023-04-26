package com.miguan.springcloud.mapper;

import com.miguan.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    Product findById(Long pid);
   // @Select("select pid,product_name,db_source from product")
    List<Product>findAll();
    //test
    boolean addProduct(Product product);


}
