package protoType.ui;

import protoType.member.Member;

import java.util.*;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // UI 객체 생성
        MemberUI memberUI = new MemberUI();
        ItemUI itemUI = new ItemUI();
        OrderUI orderUI = new OrderUI(memberUI, itemUI);

        // 현재 로그인한 회원 정보
        Member loggedInMember = null;

        int menu = 0;
        while (menu != 7) {
            System.out.println("\n===== 주문 시스템 =====");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 목록 보기");
            System.out.println("3. 상품 등록");
            System.out.println("4. 상품 목록 보기");
            System.out.println("5. 주문 생성");
            System.out.println("6. 로그인/로그아웃");
            System.out.println("7. 종료");
            System.out.print("입력: ");

            try {
                menu = sc.nextInt();
                sc.nextLine(); // 버퍼 비우기
            }
            catch (Exception e){
                System.out.println("잘못된 입력입니다");
                sc.nextLine(); // 버퍼 비우기
                continue;
            }

            switch (menu) {
                case 1:
                    // 회원 가입 페이지
                    memberUI.registerMember();
                    break;
                case 2:
                    // 회원 목록 페이지
                    memberUI.listMembers();
                    break;
                case 3:
                    // 상품 등록 페이지
                    itemUI.registerItem();
                    break;
                case 4:
                    // 상품 목록 페이지
                    itemUI.listItems();
                    break;
                case 5:
                    // 주문 생성 페이지
                    if (loggedInMember == null) {
                        System.out.println("주문하려면 먼저 로그인해야 합니다.");
                        break;
                    }
                    orderUI.createOrder(loggedInMember);
                    break;
                case 6:
                    // 로그인/로그아웃
                    if (loggedInMember == null) {
                        loggedInMember = memberUI.login();
                    } else {
                        System.out.println(loggedInMember.getName() + "님이 로그아웃 되었습니다.");
                        loggedInMember = null;
                    }
                    break;
                case 7:
                    System.out.println("종료합니다");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }

        sc.close();
    }
}

