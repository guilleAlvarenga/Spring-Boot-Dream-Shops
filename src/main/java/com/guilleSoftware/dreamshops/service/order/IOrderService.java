package com.guilleSoftware.dreamshops.service.order;

import com.guilleSoftware.dreamshops.dto.OrderDto;
import com.guilleSoftware.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
