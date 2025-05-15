package seungjun.member.service;

import seungjun.member.model.Grade;
import seungjun.member.model.Member;
import seungjun.member.repository.MemberRepository;

import java.util.List;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;

    public MemberServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public Member register(String loginId, String loginPw, String name, Grade grade) {
        if(isDuplicated(loginId)) {
            return null;
        }
        Member member = new Member(null, loginId, loginPw, name, grade);
        return repository.save(member);
    }

    @Override
    public List<Member> getAllMembers() {
        return repository.findAll();
    }

    @Override
    public boolean isDuplicated(String loginId) {
        return repository.findByLoginId(loginId) != null;
    }
}
