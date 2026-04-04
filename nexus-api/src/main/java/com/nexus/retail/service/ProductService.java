package com.nexus.retail.service;

import com.nexus.retail.model.Product;
import com.nexus.retail.payload.ProductDTO;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);
}
