package seungjun.member.ui;

import seungjun.member.model.Grade;
import seungjun.member.model.Member;
import seungjun.member.service.MemberService;

import java.util.Scanner;

public class MemberUI {
    private final MemberService service;
    private final Scanner scanner = new Scanner(System.in);

    public MemberUI(MemberService service) {
        this.service = service;
    }

    public void start() {
        while (true) {
            System.out.println("\n[회원가입 시스템]");
            System.out.println("1. 회원가입");
            System.out.println("2. 전체 회원 조회");
            System.out.println("0. 종료");
            System.out.print("입력: ");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> register();
                case 2 -> list();
                case 0 -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void register() {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        if (service.isDuplicated(id)) {
            System.out.println("이미 존재하는 아이디입니다.");
            return;
        }

        System.out.print("비밀번호: ");
        String pw = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("등급 (BASIC/VIP): ");
        Grade grade = Grade.valueOf(scanner.nextLine().toUpperCase());

        Member member = service.register(id, pw, name, grade);
        if (member != null) {
            System.out.println("가입 완료: " + member);
        } else {
            System.out.println("가입 실패");
        }
    }

    private void list() {
        for (Member m : service.getAllMembers()) {
            System.out.println(m);
        }
    }
}

