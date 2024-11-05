package com.guilleSoftware.dreamshops.service.cart;

import com.guilleSoftware.dreamshops.model.Cart;
import com.guilleSoftware.dreamshops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Cart initializeNewCart(User user);
    Cart getCartByUserId(Long userId);
}
