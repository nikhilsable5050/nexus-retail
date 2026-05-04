package com.nexus.retail.service;

import com.nexus.retail.payload.CartDTO;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
}
