package protoType.order.discount;

import protoType.member.Member;

public interface DiscountPolicy {
    // Member 객체는 왜 필요하지? -> VIP 체크하려고
    //boolean discount(Member member, int price);
    int discount(Member member, int price);
}
