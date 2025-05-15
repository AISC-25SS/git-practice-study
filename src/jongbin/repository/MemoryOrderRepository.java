package jongbin.repository;

import jongbin.entity.Order;

import java.util.*;

public class MemoryOrderRepository implements OrderRepository {
    //유저와 주문은 1대n 매칭 관계인데 반해 map은 1:1만 저장할 수 있는데...
    private static Map<Long, Long> orderRelationships = new HashMap<>();    //주문id : 주문자id
    private static Map<Long, Order> orderContends = new HashMap<>();        //주문id : 주문객체

    @Override
    public List<Order> findOrders(Long memberId) {
        List<Order> orderContendsList = new ArrayList<>();
        Set<Long> relationshipKey = orderRelationships.keySet();
        Long orderId;
        for (Long key : relationshipKey) {
            //주문id들 중 유저id와 매칭되는 것들을 찾아서 리스트에 저장한다
            if (Objects.equals(orderRelationships.get(key), memberId)) {
                orderId = key;
                orderContendsList.add(orderContends.get(orderId));
            }
        }
        return orderContendsList;
    }

    @Override
    public Order saveOrder(Order order) {
        return null;
    }

    @Override
    public Order findOrder(Long orderId) {
        return null;
    }

    @Override
    public Order removeOrder(Long memberId) {
        return null;
    }
}
