package kangdowon.item.ui;

import kangdowon.item.revise.ReviseService;
import kangdowon.item.repository.ItemRepository;
import kangdowon.item.list.List;
import kangdowon.item.registration.Registration;

import java.util.Scanner;

public class Ui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemRepository repo = new ItemRepository();
        Registration registration = new Registration(repo);
        List list = new List(repo);
        ReviseService revise = new ReviseService(repo);

        while (true) {
            System.out.println("\n1. 상품 등록 | 2. 목록 조회 | 3. 수정 | 0. 종료");
            int sel = sc.nextInt(); sc.nextLine();
            if (sel == 1) {
                System.out.print("상품명: ");
                String name = sc.nextLine();
                System.out.print("가격: ");
                int price = sc.nextInt(); sc.nextLine();
                registration.register(name, price);
            } else if (sel == 2) {
                list.showAll();
            } else if (sel == 3) {
                System.out.print("수정할 ID: ");
                int id = sc.nextInt(); sc.nextLine();
                System.out.print("새 이름: ");
                String newName = sc.nextLine();
                System.out.print("새 가격: ");
                int newPrice = sc.nextInt(); sc.nextLine();
                revise.reviseItem(id, newName, newPrice);
            } else if (sel == 0) {
                break;
            }
        }
    }
}
