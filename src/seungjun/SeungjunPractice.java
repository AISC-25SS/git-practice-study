package seungjun;

import seungjun.member.domain.Member; //추가
import seungjun.member.repository.MemberRepository;
import seungjun.member.service.MemberService;
import seungjun.member.service.MemberServiceImpl;
import seungjun.member.ui.MemberUI;

import java.util.Map;
import java.util.Scanner;

public class SeungjunPractice {

    public static void main(String[] args){

        MemberService service = new MemberServiceImpl(new MemberRepository());
        MemberUI ui = new MemberUI(service);
        ui.start();
    }

     // 은혜 추가 : 회원 삭제 테스트 기능

        // 삭제 전 전체 회원 목록 출력
        Map<Long, Member> members = service.findAll();
        System.out.println("삭제 전 전체 회원 목록:");
        for (Long id : members.keySet()) {
            Member m = members.get(id);
            System.out.println("ID: " + m.getId() + ", 이름: " + m.getName());
        }
        // 사용자에게 삭제할 ID 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 회원의 ID를 입력하세요: ");
        Long deleteId = sc.nextLong();

        // 삭제 실행
        Member member = service.findById(deleteId);
        if (member == null) {
            System.out.println("해당 ID의 회원이 없습니다.");
        } else {
            service.deleteMember(deleteId);
            System.out.println("ID " + deleteId + " 회원이 삭제되었습니다.");
        }

         // 삭제 후 목록 출력
        members = service.findAll();
        System.out.println("삭제 후 전체 회원 목록:");
        for (Long id : members.keySet()) {
            Member m = members.get(id);
            System.out.println("ID: " + m.getId() + ", 이름: " + m.getName());
        }
    }

    // 여기에 본인이 담당한 기능을 구현해 보세요!!
    // 양식은 자율 입니다.
}
