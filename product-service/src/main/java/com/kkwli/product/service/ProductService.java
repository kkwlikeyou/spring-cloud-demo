package com.kkwli.product.service;

import com.kkwli.product.entity.Product;

public interface ProductService {
    Product findById(Long id);

    void save(Product product);

    void update(Product product);

    void delete(Long id);

}
