package protoType.order;

// Order.java
public class Order {
    private Long memberId;         // 주문자 회원 ID
    private Long itemId;           // 상품명
    private int itemPrice;         // 상품 가격
    private int quantity;          // 수량
    private int discountPrice;     // 할인 금액
    private int finalPrice;        // 최종 결제 금액

    // 생성자
    // 회원 ID와 상품 ID를 입력받아 주문 생성
    public Order(Long memberId, Long itemId) {
        this.memberId = memberId;
        this.itemId = itemId;
    }
    //수량 입력 → 총 금액 계산
    // 할인 정책 적용 → 할인 금액 및 최종 결제 금액 도출
    //
    // 계산 메서드
    // 출력 메서드 등 포함
//    @Override
//    public String toString() {
//        return "[주문 완료]" + "\n" +
//                "회원: " + memberService.findById(memberId).name + " "
//                + "(" + memberService.findById(memberId).grade + ")" + "\n" +
//                "상품: " + itemService.findById(itemId) + "\n" +
//                "수량: " + itemPrice + "개" + "\n" +
//                "할인 적용: " + discountPrice + "원" + "\n" +
//                "총 금액: " + finalPrice + "원" + "\n";
//    }
}
