package protoType.order.discount;

import protoType.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member member, int price) {
        return price * 9 / 10;
    }
}
