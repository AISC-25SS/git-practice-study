package protoType.member;

import java.util.List;

public class MemberServiceImpl implements MemberService {


    public MemberServiceImpl(MemberRepository memberRepository) {
    }

    @Override
    public void join(Member member) {

    }

    @Override
    public Member findById(Long memberId) {
        return null;
    }

    @Override
    public Member login(String loginId, String loginPw) {
        return null;
    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }
}
