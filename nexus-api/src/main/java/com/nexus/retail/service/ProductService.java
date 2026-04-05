package com.nexus.retail.service;

import com.nexus.retail.model.Product;
import com.nexus.retail.payload.ProductDTO;
import com.nexus.retail.payload.ProductResponse;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);
}
