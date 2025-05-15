package jongbin.repository;

import jongbin.entity.Order;
import java.util.List;

public interface OrderRepository {
    //주문 정보 순회
    List<Order> findOrders(Long memberId);
    //주문 정보 생성
    Order saveOrder(Order order);
    //주문 정보 탐색
    Order findOrder(Long orderId);
    //주문 정보 수정
    //Order modifyOrder(Order order);
    //주문 정보 삭제
    Order removeOrder(Long memberId);
}
