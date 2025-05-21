package protoType.ui;

import protoType.member.Member;
import protoType.member.Grade;
import protoType.item.Item;
import protoType.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderUI {
    private final Scanner scanner = new Scanner(System.in);
    //private List<Order> orders = new ArrayList<>();
    private MemberUI memberUI;
    private ItemUI itemUI;

    public OrderUI(MemberUI memberUI, ItemUI itemUI) {
        this.memberUI = memberUI;
        this.itemUI = itemUI;
    }

    public void createOrder(Member member) {
        System.out.println("\n===== 상품 주문 =====");

        // 상품 목록 표시
//        List<Item> items = itemUI.getItems();
//        if (items.isEmpty()) {
//            System.out.println("등록된 상품이 없습니다.");
//            return;
//        }
//
//        System.out.println("주문 가능한 상품 목록:");
//        for (Item item : items) {
//            System.out.println(item);
//        }

        // 상품 선택
//        System.out.print("주문할 상품 ID 입력: ");
//        Long itemId = scanner.nextLong();
//        scanner.nextLine(); // 버퍼 비우기
//
//        Item selectedItem = itemUI.findItemById(itemId);
//        if (selectedItem == null) {
//            System.out.println("해당 ID의 상품을 찾을 수 없습니다.");
//            return;
//        }

        // 수량 입력
//        System.out.print("주문 수량 입력: ");
//        int quantity = scanner.nextInt();
//        scanner.nextLine(); // 버퍼 비우기
//
//        if (quantity <= 0) {
//            System.out.println("수량은 1개 이상이어야 합니다.");
//            return;
//        }

        // 주문 생성
        int itemPrice = selectedItem.getPrice();
        int totalPrice = itemPrice * quantity;

        // 할인 계산 (VIP 회원은 10% 할인)
        int discountPrice = 0;
        if (member.getGrade() == Grade.VIP) {
            discountPrice = (int)(totalPrice * 0.1);
        }

        int finalPrice = totalPrice - discountPrice;

        Order newOrder = new Order(member.getMemberId(), itemId, itemPrice, quantity, discountPrice, finalPrice);
        orders.add(newOrder);

        System.out.println("주문이 완료되었습니다.");
        System.out.println(newOrder);
    }

    public void listMyOrders(Member member) {
        System.out.println("\n===== 내 주문 내역 =====");

        boolean hasOrders = false;
        for (Order order : orders) {
            if (order.getMemberId().equals(member.getMemberId())) {
                System.out.println(order);
                hasOrders = true;
            }
        }

        if (!hasOrders) {
            System.out.println("주문 내역이 없습니다.");
        }
    }
}

