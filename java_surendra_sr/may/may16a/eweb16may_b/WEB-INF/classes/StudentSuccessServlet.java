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

public class StudentSuccessServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		 
			HttpSession session = request.getSession();
			User user  =  (User) session.getAttribute("client");
			
			 StringBuffer htmlCode = new StringBuffer();
				htmlCode.append("<html>");
				htmlCode.append("<head>");
				htmlCode.append("<title>sis</title>");
				htmlCode.append("</head>");
				htmlCode.append("<body bgcolor='pink' text='blue'>");
				htmlCode.append("<h1>Welcome TO Sis</h1><hr>");
				htmlCode.append("<h1>Hello user"+user.getName()+"(Student)</h1><hr>");
				htmlCode.append("<a href='#'>show assignment</a><hr>");
				htmlCode.append("<a href='#'>download books</a><hr>");
				htmlCode.append("<a href='logout'>Logout</a><hr>");
				htmlCode.append("</body>");
				htmlCode.append("</html>");
				PrintWriter pw  = response.getWriter();
				response.setContentType("text/html");
				pw.print(htmlCode);
	}

}
