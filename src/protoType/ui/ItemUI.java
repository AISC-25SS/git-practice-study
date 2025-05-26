package protoType.ui;

import protoType.item.*;

import java.util.*;

public class ItemUI {
    private final Scanner scanner = new Scanner(System.in);
    //객체를 여기다 생성하는 게 맞나
    private final ItemRepository itemRepository = new MemoryItemRepository();
    private final ItemService itemService = new ItemServiceImpl(itemRepository);

    public void start() {
        while (true) {
            System.out.println("\n=== 상품 관리 시스템 ===");
            System.out.println("1. 상품 등록");
            System.out.println("2. 전체 상품 조회");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            String input = scanner.nextLine();
            switch (input) {
//                case "1":
//                    registerItem();
//                    break;

                case "2":
                    listItems();
                    break;

                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
            }
        }
    }
//    //상품명과 가격을 입력받아 Item 객체 생성
//    private Item registerItem() {
//        String itemName;
//        int price;
//        Item registeredItem;
//        System.out.print("상품명 입력:");
//        try {
//            itemName = scanner.next();
//        }
//        catch (Exception e) {
//            System.out.println("잘못된 입력입니다");
//            // return 쓰면 어디로 가지??
//            continue;
//        }
//        System.out.print("가격 입력: ");
//        try {
//            price = scanner.nextInt();
//        }
//        catch (Exception e) {
//            System.out.println("잘못된 입력입니다");
//            // return 쓰면 어디로 가지??
//            continue;
//        }
//        registeredItem = itemService.register(itemName, price);
//        System.out.println("상품이 등록되었습니다: " + registeredItem);
//    }

    // 상품 전체 검색(순회)
    public void listItems() {
        List<Item> items = itemService.getAllItems();
        if (items.isEmpty()) {
            System.out.println("등록된 상품이 없습니다");
        }
        else {
            System.out.println("[전체 상품 목록]");
            for (Item item : items)
                System.out.println(item);
        }
    }
}
