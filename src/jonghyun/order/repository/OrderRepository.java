// jonghyun/order/repository/OrderRepository.java
package jonghyun.order.repository;

import jonghyun.order.order.Order;

public interface OrderRepository {
    void save(Order order);
    Order findById(Long memberId);
}