package controller;

import logic.MemberDao;
import model.Member;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/member")
public class MemberServlet extends HttpServlet {
    @EJB
    private MemberDao memberDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String memberIdStr = req.getParameter("memberId");
        int memberId = 0;
        if (memberIdStr != null && !memberIdStr.equals(""))
            memberId = Integer.parseInt(memberIdStr);
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String mobileNumberStr = req.getParameter("mobileNumber ");
        int mobileNumber = 0;
        if (mobileNumberStr != null && !mobileNumberStr.equals(""))
            mobileNumber = Integer.parseInt(mobileNumberStr);

        Member member = new Member(memberId, firstName, lastName, email, mobileNumber);

        if ("Add".equalsIgnoreCase(action)) {
            memberDao.addMember(member);
            resp.setHeader("infoUpdate", "Registration Successful");
        }else if("Edit".equalsIgnoreCase(action)){
            memberDao.editMember(member);
        }else if("Delete".equalsIgnoreCase(action)){
            memberDao.deleteMember(memberId);
        }else if("Search".equalsIgnoreCase(action)){
            member = memberDao.getMember(memberId);
        }
        req.setAttribute("member", member);
        req.setAttribute("allMembers", memberDao.getAllMembers());
        req.getRequestDispatcher("member").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("member").forward(req, resp);
    }
}
