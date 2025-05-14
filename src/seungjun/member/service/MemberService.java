package seungjun.member.service;

import seungjun.member.model.Grade;
import seungjun.member.model.Member;

import java.util.List;

public interface MemberService {
    Member register(String loginId, String loginPw, String name, Grade grade);
    List<Member> getAllMembers();
    boolean isDuplicated(String loginId);
}