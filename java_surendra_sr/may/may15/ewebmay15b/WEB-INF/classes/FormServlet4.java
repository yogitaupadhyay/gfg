import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

public class FormServlet4  extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		

		String formNo  = request.getParameter("stu_form_no");
		String name  = request.getParameter("stu_name");
		String age  = request.getParameter("stu_age");
		String gender  = request.getParameter("stu_gender");
		String college  = request.getParameter("stu_college_name");
		String email  = request.getParameter("stu_email");
		String mobile  = request.getParameter("stu_mobile");
	
		
		
		//name age gender college email mobile
		//DB insert code  TODO
		//msg success or fail
        StringBuffer htmlCode = new StringBuffer();
		htmlCode.append("<html>");
		htmlCode.append("<head>");
		htmlCode.append("<title>Sis</title>");
		htmlCode.append("</head>");
		htmlCode.append("<body >");
		htmlCode.append("<h1>Your following data submitted...</h1><hr>");
		htmlCode.append("<h1>form no : "+formNo+"</h1>");
		htmlCode.append("<h1>name : "+name+"</h1>");
		htmlCode.append("<h1>age : "+age+"</h1>");
		htmlCode.append("<h1>gender : "+gender+"</h1>");
		htmlCode.append("<h1>college : "+college+"</h1>");
		htmlCode.append("<h1>email : "+email+"</h1>");
		htmlCode.append("<h1>mobile : "+mobile+"</h1>");
		htmlCode.append("</body>");
		htmlCode.append("</html>");
		//how to print into browser
		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		pw.print(htmlCode);
		
        
		
		
		
	}

}