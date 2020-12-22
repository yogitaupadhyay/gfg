import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2019 
 */

public class LoginServlet extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String loginId = request.getParameter("login_id");
		String loginPassword = request.getParameter("login_password");
		System.out.println(loginId);
		System.out.println(loginPassword);
		User user  = null;
		
		Connection con  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = SisDbConnectionUtil.getConnection();
			String sql = "select * from my_nit_user"
					+ " where login_id=? and login_password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, loginId);
			pstmt.setString(2, loginPassword);
			
			rs  = pstmt.executeQuery();
			if(rs.next()) {
				long id  = rs.getLong("id");
				String name = rs.getString("name");
				//String loginId = rs.getString("login_id")
				String role =rs.getString("role");
				user = new User();
				user.setId(id);
				user.setName(name);
				user.setLoginId(loginId);
				user.setRole(role);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				SisDbConnectionUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
     //db logig end		
		
		
		
		
		if(user!=null) {
			//create new session object
			HttpSession session = request.getSession();
			System.out.println("new user created "+ session.isNew() +" id =" + session.getId() +" time  " + session.getCreationTime() );
			session.setAttribute("client", user);
			
			 StringBuffer htmlCode = new StringBuffer();
				htmlCode.append("<html>");
				htmlCode.append("<head>");
				htmlCode.append("<title>dept</title>");
				htmlCode.append("</head>");
				htmlCode.append("<body >");
				htmlCode.append("<h1>Welcome TO Sis</h1><hr>");
				htmlCode.append("<h1>Hello user"+user.getName()+"("+user.getRole()+")</h1><hr>");
				htmlCode.append("<a href='s2'>go to Service2</a><hr>");
				htmlCode.append("<a href='s3'>go to Service3</a><hr>");
				htmlCode.append("<a href='logout'>Logout</a><hr>");
				htmlCode.append("</body>");
				htmlCode.append("</html>");
				PrintWriter pw  = response.getWriter();
				pw.print(htmlCode);
				
		}else {//login failed
			
			 response.setContentType("text/html");
			 response.getWriter().print("<h1 style='color:red;'>invalid login id or password</h1><hr>");
			 request.getRequestDispatcher("login.html").include(request, response);
		}//end login failed
		 
		
	}

}
