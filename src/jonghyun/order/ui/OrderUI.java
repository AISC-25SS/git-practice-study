// jonghyun/order/ui/OrderUI.java
package jonghyun.order.ui;

import jonghyun.order.service.OrderService;
import java.util.Scanner;

public class OrderUI {

    private final OrderService orderService;
    private final Scanner scanner = new Scanner(System.in);

    public OrderUI() {
        this.orderService = new OrderService();
    }

    public void start() {
        System.out.println("=== 🛒 주문 시스템 시작 ===");

        System.out.print("회원 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("회원 ID를 입력하세요 (숫자): ");
        Long memberId = Long.parseLong(scanner.nextLine());

        System.out.print("회원 등급을 입력하세요 (VIP/일반): ");
        String grade = scanner.nextLine();
        boolean isVIP = grade.equalsIgnoreCase("VIP");

        System.out.print("상품명을 입력하세요: ");
        String itemName = scanner.nextLine();

        System.out.print("상품 가격을 입력하세요: ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("수량을 입력하세요: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        orderService.createOrder(memberId, name, isVIP, itemName, price, quantity);
    }
}