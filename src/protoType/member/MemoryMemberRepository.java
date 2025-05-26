package protoType.member;

import java.util.List;

public class MemoryMemberRepository implements MemberRepository{
    @Override
    public void save(Member member) {

    }

    @Override
    public Member findById(Long memberId) {
        return null;
    }

    @Override
    public Member findByLoginId(String loginId) {
        return null;
    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }
}
