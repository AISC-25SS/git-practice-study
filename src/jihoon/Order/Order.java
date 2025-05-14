package jihoon.Order;

// Order.java
public class Order {
    private Long memberId;         // 주문자 회원 ID
    private String itemName;       // 상품명
    private int itemPrice;         // 상품 가격
    private int discountPrice;     // 할인 금액
    private int finalPrice;        // 최종 결제 금액

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice, int finalPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this. finalPrice = finalPrice;

    }
    public Long getId() {
        return memberId;
    }
    // 생성자, 계산 메서드, 출력 메서드 등 포함
}
