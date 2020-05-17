package logic;

import model.Member;

import javax.ejb.Local;
import java.util.List;

@Local
public interface MemberDaoLocal {
    void addMember(Member member);
    void editMember(Member member);
    void deleteMember(int memberId);
    Member getMember(int memberId);
    List<Member> getAllMembers();
}
