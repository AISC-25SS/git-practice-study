package nohsungbeen.item;


import java.util.List;
import java.util.Scanner;

public class ItemUI {
    private final Scanner sc = new Scanner(System.in);
    private final ItemRepository repository = new ItemRepository();

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("=== 상품 관리 ===");
            System.out.println("1. 상품 등록");
            System.out.println("2. 상품 목록 조회");
            System.out.println("3. 상품 정보 수정");
            System.out.println("4. 상품 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> register();
                case 2 -> list();
                case 3 -> update();
                case 4 -> delete();
                case 5 -> running = false;
                default -> System.out.println("잘못된 선택입니다.");
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }

    private void register() {
        System.out.print("상품명: ");
        String name = sc.nextLine();
        System.out.print("가격: ");
        int price = Integer.parseInt(sc.nextLine());
        Item item = new Item(null, name, price);
        repository.save(item);
        System.out.println("등록 완료: " + item);
    }

    private void list() {
        List<Item> items = repository.findAll();
        if (items.isEmpty()) {
            System.out.println("등록된 상품이 없습니다.");
            return;
        }
        for (Item item : items) System.out.println(item);
    }

    private void update() {
        System.out.print("수정할 상품 ID: ");
        Long id = Long.valueOf(sc.nextLine());
        Item item = repository.findById(id);
        if (item == null) {
            System.out.println("상품을 찾을 수 없습니다.");
            return;
        }
        System.out.print("새 상품명(" + item.getName() + "): ");
        String name = sc.nextLine();
        System.out.print("새 가격(" + item.getPrice() + "): ");
        int price = Integer.parseInt(sc.nextLine());
        repository.update(id, name, price);
        System.out.println("수정 완료: " + repository.findById(id));
    }

    private void delete() {
        System.out.print("삭제할 상품 ID: ");
        Long id = Long.valueOf(sc.nextLine());
        if (repository.findById(id) == null) {
            System.out.println("상품을 찾을 수 없습니다.");
            return;
        }
        repository.delete(id);
        System.out.println("삭제 완료. ID: " + id);
    }
}
