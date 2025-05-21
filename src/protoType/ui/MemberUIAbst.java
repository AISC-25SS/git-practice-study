package protoType.ui;

import protoType.member.Member;

import java.util.List;

public interface MemberUIAbst {
    // 회원 페이지 UI
    public void showMenu();
    // 회원 가입
    private void registerMember();
    // 회원 목록 조회
    private void listMembers();
    // 회원 검색
    private void searchMember();
    // 다른 클래스에서 회원 목록에 접근할 수 있는 getter
    public List<Member> getMembers();
    // 로그인 기능
    public Member login();
}
