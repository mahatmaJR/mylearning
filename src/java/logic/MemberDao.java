package logic;

import model.Member;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MemberDao implements MemberDaoLocal {
    @PersistenceContext(name = "LearnPU")
    private EntityManager entity;

    @Override
    public void addMember(Member member) {
        entity.persist(member);
    }

    @Override
    public void editMember(Member member) {
        entity.merge(member);
    }

    @Override
    public void deleteMember(int memberId) {
        entity.remove(getMember(memberId));
    }

    @Override
    public Member getMember(int memberId) {
        return entity.find(Member.class, memberId);
    }

    @Override
    public List<Member> getAllMembers() {
        return entity.createNamedQuery("Member.getAll").getResultList();
    }
}
