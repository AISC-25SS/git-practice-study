package protoType.config;

import protoType.member.MemberRepository;
import protoType.member.MemberService;
import protoType.item.ItemRepository;
import protoType.item.ItemService;
import protoType.order.discount.DiscountPolicy;

import protoType.member.MemoryMemberRepository;
import protoType.member.MemberServiceImpl;
import protoType.item.MemoryItemRepository;
import protoType.item.ItemServiceImpl;
import protoType.order.discount.RateDiscountPolicy;


public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public ItemService itemService() {
        return new ItemServiceImpl(itemRepository());
    }

    public ItemRepository itemRepository() {
        return new MemoryItemRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy(); // FixedDiscountPolicy 로 교체 가능
    }

//    public OrderService orderService() {
//        return new OrderServiceImpl(memberService(), itemService(), discountPolicy());
//    }
//
//    public OrderRepository orderRepository() {
//        return new MemoryOrderRepository();
//    }
}
