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

public class FormServlet2  extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String formNo  = request.getParameter("stu_form_no");
		String name  = request.getParameter("stu_name");
		String age  = request.getParameter("stu_age");
		
		
        StringBuffer htmlCode = new StringBuffer();
		htmlCode.append("<html>");
		htmlCode.append("<head>");
		htmlCode.append("<title>Sis</title>");
		htmlCode.append("</head>");
		htmlCode.append("<body >");
		htmlCode.append("<h1>Student form Step2</h1><hr>");
		htmlCode.append("<form method='post' action='fs3'>");

		htmlCode.append("<input type='hidden' name='stu_form_no' value='"+formNo+"'>");
		htmlCode.append("<input type='hidden' name='stu_name'    value='"+name+"'>");
		htmlCode.append("<input type='hidden' name='stu_age'     value='"+age+"'>");
		
		htmlCode.append("Gender :<input type='text' name='stu_gender'><br>");
		htmlCode.append("college name :<input type='text' name='stu_college_name'><br>");
		htmlCode.append("<input type='submit' value='next'>");
		htmlCode.append("</form>");
		htmlCode.append("</body>");
		htmlCode.append("</html>");
		//how to print into browser
		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		pw.print(htmlCode);
		
        
		
		
		
	}

}