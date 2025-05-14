// jonghyun/order/service/OrderService.java
package jonghyun.order.service;

import jonghyun.order.order.Order;
import jonghyun.order.repository.MemoryOrderRepository;
import jonghyun.order.repository.OrderRepository;

public class OrderService {

    private final OrderRepository orderRepository = new MemoryOrderRepository();

    public Order createOrder(Long memberId, String memberName, boolean isVIP,
                             String itemName, int itemPrice, int quantity) {

        int discount = isVIP ? 1000 : 0;
        Order order = new Order(memberId, itemName, itemPrice, discount, quantity);
        orderRepository.save(order);
        order.printOrder(memberName, isVIP);
        return order;
    }
}