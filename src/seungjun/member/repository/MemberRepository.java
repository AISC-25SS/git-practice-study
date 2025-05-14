package seungjun.member.repository;

import seungjun.member.model.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private final Map<Long, Member> userInfo = new HashMap<>();
    private Long memberId = 1L;

    public Member save(Member member){
        Member newMember = new Member(
                this.memberId++,
                member.getLoginId(),
                member.getLoginPw(),
                member.getName(),
                member.getGrade()
                );

        userInfo.put(newMember.getMemberId(), newMember);
        return newMember;
    }

    public Member findByLoginId(String loginId) {
        for(Member member : userInfo.values()) {
            if(member.getLoginId().equals(loginId)){
                return member;
            }
        }
        return null;
    }

    public List<Member> findAll() {
        return new ArrayList<>(userInfo.values());
    }
}
