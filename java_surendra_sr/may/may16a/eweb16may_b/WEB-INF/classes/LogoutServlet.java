import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
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

public class LogoutServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//way 1
		/*
		StringBuffer htmlCode = new StringBuffer();
			htmlCode.append("<html>");
			htmlCode.append("<head>");
			htmlCode.append("<title>dept</title>");
			htmlCode.append("</head>");
			htmlCode.append("<body >");
		
		HttpSession session = request.getSession(false);
		//if session found return it otherwise return null
		if(session!=null) {
			session.invalidate();
			htmlCode.append("<h1>Successfuly logout</h1><hr>");
		}else {
			htmlCode.append("<h1>already session expired</h1><hr>");
		}
		
		htmlCode.append("<a href='login.html'>re-login</a><hr>");
		htmlCode.append("<a href='sis.html'>back to home</a><hr>");
		htmlCode.append("</body>");
		htmlCode.append("</html>");
		PrintWriter pw  = response.getWriter();
		pw.print(htmlCode);
		
		*/ 
		
		
		
		//way 2
		HttpSession session = request.getSession(false);
		if(session!=null) {
			session.invalidate();
		} 
		
		response.sendRedirect("sis.html?msg=success");
		//response.sendRedirect("login.html");
		
		
	}

}
