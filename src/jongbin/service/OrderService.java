package jongbin.service;

import jongbin.entity.Order;

public interface OrderService {
    // 주문 생성
    public Order purchase(Order order);
    // 주문 탐색
    public Order findById(Long memberId, Long itemId);
    // 주문 수정
    // 주문 삭제
    public Order cancel(Order order);
    // 주문 정보 출력
    public String toString();
}
