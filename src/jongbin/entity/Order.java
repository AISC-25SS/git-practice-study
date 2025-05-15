package jongbin.entity;

import seungjun.item.repository.ItemRepository;
import seungjun.item.service.ItemService;
import seungjun.member.repository.MemberRepository;
import seungjun.member.service.MemberService;
import seungjun.member.service.MemberServiceImpl;


public class Order {
    private Long memberId;         // 주문자 회원 ID
    private String itemName;
//    private Long itemId;           // 상품 ID
    private int itemPrice;         // 상품 가격
    private int discountPrice;     // 할인 금액
    private int finalPrice;        // 최종 결제 금액

    public Order(Long memberId, Long itemId) {
        this.memberId = memberId;
        this.itemId = itemId;
    }

    MemberRepository memberRepository = new MemberRepository();
    MemberService memberService = new MemberServiceImpl(memberRepository);
    ItemRepository itemRepository = new ItemRepository();
    ItemService itemService = new ItemService(itemRepository);

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
