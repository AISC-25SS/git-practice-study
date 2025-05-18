package jongbin.service;

import jongbin.entity.Order;
import jongbin.repository.MemoryOrderRepository;
import jongbin.repository.OrderRepository;
import seungjun.item.repository.ItemRepository;

public class OrderServiceImpl implements OrderService{

    //private final OrderRepository orderRepository = new MemoryOrderRepository();
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order purchase(Order order) {
        return null;
    }

    @Override
    public Order findById(Long memberId, Long itemId) {
        return null;
    }

    @Override
    public Order cancel(Order order) {
        return null;
    }

    @Override
    public String toString() {
        return "[주문 완료]" + "\n" +
                "회원: " + memberService.findById(memberId).name + " "
                + "(" + memberService.findById(memberId).grade + ")" + "\n" +
                "상품: " + itemService.findById(itemId) + "\n" +
                "수량: " + itemPrice + "개" + "\n" +
                "할인 적용: " + discountPrice + "원" + "\n" +
                "총 금액: " + finalPrice + "원" + "\n";
    }
}
