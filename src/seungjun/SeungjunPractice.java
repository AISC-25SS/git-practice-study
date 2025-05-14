package seungjun;

import seungjun.member.repository.MemberRepository;
import seungjun.member.service.MemberService;
import seungjun.member.service.MemberServiceImpl;
import seungjun.member.ui.MemberUI;

public class SeungjunPractice {

    public static void main(String[] args){

        MemberService service = new MemberServiceImpl(new MemberRepository());
        MemberUI ui = new MemberUI(service);
        ui.start();
    }

    // 여기에 본인이 담당한 기능을 구현해 보세요!!
    // 양식은 자율 입니다.
}
