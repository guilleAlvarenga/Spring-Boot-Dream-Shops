package com.guilleSoftware.dreamshops.dto;

import com.guilleSoftware.dreamshops.enums.OrderStatus;
import com.guilleSoftware.dreamshops.service.order.IOrderService;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private Long userId;
    private LocalDate orderDate;
    private BigDecimal totalAmount;
    private OrderStatus status;
    private List<OrderItemDto> items;

}
