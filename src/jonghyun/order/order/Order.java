// jonghyun/order/order/Order.java
package jonghyun.order.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;
    private int finalPrice;
    private int quantity;

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice, int quantity) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
        this.quantity = quantity;
        this.finalPrice = (itemPrice * quantity) - discountPrice;
    }

    public void printOrder(String memberName, boolean isVIP) {
        System.out.println("[주문 완료]");
        System.out.println("회원: " + memberName + (isVIP ? " (VIP)" : ""));
        System.out.println("상품: " + itemName);
        System.out.println("수량: " + quantity + "개");
        System.out.println("할인 적용: " + discountPrice + "원");
        System.out.println("총 금액: " + String.format("%,d", itemPrice * quantity) + "원");
        System.out.println("최종 결제금액: " + String.format("%,d", finalPrice) + "원");
    }

    public Long getMemberId() {
        return memberId;
    }
}