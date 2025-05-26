package protoType.ui;

import protoType.member.Grade;
import protoType.member.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberUI {
    private Scanner scanner = new Scanner(System.in);
    // memberRepository에서 가져오는 게 아니고?
    private List<Member> members = new ArrayList<>();
    private Long nextMemberId = 1L;

    public void showMenu() {
        while (true) {
            System.out.println("\n===== 회원 관리 =====");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 목록 조회");
            System.out.println("3. 회원 검색");
            System.out.println("0. 메인 메뉴로 돌아가기");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    registerMember();
                    break;
                case 2:
                    listMembers();
                    break;
                case 3:
                    searchMember();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }

    public void registerMember() {
        System.out.println("\n===== 회원 가입 =====");

        System.out.print("로그인 ID: ");
        String loginId = scanner.nextLine();

        System.out.print("비밀번호: ");
        String loginPw = scanner.nextLine();

        System.out.print("이름: ");
        String name = scanner.nextLine();

        System.out.println("등급 선택 (1: BASIC, 2: VIP): ");
        int gradeChoice = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        Grade grade = (gradeChoice == 2) ? Grade.VIP : Grade.BASIC;

        Member newMember = new Member(nextMemberId++, loginId, loginPw, name, grade);
        members.add(newMember);

        System.out.println("회원 가입이 완료되었습니다.");
        System.out.println(newMember);
    }

    private void listMembers() {
        System.out.println("\n===== 회원 목록 =====");

        if (members.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }

        for (Member member : members) {
            System.out.println(member);
        }
    }

    private void searchMember() {
        System.out.println("\n===== 회원 검색 =====");
        System.out.print("검색할 회원 ID 입력: ");
        Long memberId = scanner.nextLong();
        scanner.nextLine(); // 버퍼 비우기

        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                System.out.println("검색 결과:");
                System.out.println(member);
                return;
            }
        }

        System.out.println("해당 ID의 회원을 찾을 수 없습니다.");
    }

    // 다른 클래스에서 회원 목록에 접근할 수 있는 getter
    public List<Member> getMembers() {
        return members;
    }

    // 로그인 기능
    public Member login() {
        System.out.println("\n===== 로그인 =====");
        System.out.print("ID: ");
        String loginId = scanner.nextLine();

        System.out.print("비밀번호: ");
        String loginPw = scanner.nextLine();

        for (Member member : members) {
            if (member.getLoginId().equals(loginId) && member.getLoginPw().equals(loginPw)) {
                System.out.println("로그인 성공! 환영합니다, " + member.getName() + "님.");
                return member;
            }
        }

        System.out.println("로그인 실패. ID 또는 비밀번호가 일치하지 않습니다.");
        return null;
    }
}

