// jonghyun/order/repository/MemoryOrderRepository.java
package jonghyun.order.repository;

import jonghyun.order.order.Order;
import java.util.HashMap;
import java.util.Map;

public class MemoryOrderRepository implements OrderRepository {

    private final Map<Long, Order> store = new HashMap<>();

    @Override
    public void save(Order order) {
        store.put(order.getMemberId(), order);
    }

    @Override
    public Order findById(Long memberId) {
        return store.get(memberId);
    }
}