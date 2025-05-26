package protoType.order.discount;

import protoType.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member member, int price) {
        return price - 1000;
    }
}
