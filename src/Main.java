import java.util.*;

public class Main {
    public static void main(String[] args) {

        int menu = 0;
        Scanner sc = new Scanner(System.in);

        while (menu != 6) {
            System.out.println("===== 주문 시스템 =====");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 목록 보기");
            System.out.println("3. 상품 등록");
            System.out.println("4. 상품 목록 보기");
            System.out.println("5. 주문 생성");
            System.out.println("6. 종료");
            System.out.print("입력:");
        //https://inpa.tistory.com/entry/JAVA-☕-예외-처리Exception-문법-응용-정리#try_-_catch_문
            try {
                menu = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("잘못된 입력입니다");
            }

            switch (menu) {
                case 1:
                    //회원 가입 페이지
                case 2:
                    //회원 목록 페이지
                case 3:
                    //상품 등록 페이지
                case 4:
                    //상품 목록 페이지
                case 5:
                    //주문 생성 페이지
                case 6:
                    System.out.println("종료합니다");
                    break;
                default:

            }
        }












    }
}