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

public class FormServlet1  extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
        StringBuffer htmlCode = new StringBuffer();
		htmlCode.append("<html>");
		htmlCode.append("<head>");
		htmlCode.append("<title>Sis</title>");
		htmlCode.append("</head>");
		htmlCode.append("<body >");
		htmlCode.append("<h1>Student form Step1</h1><hr>");
		htmlCode.append("<form method='post' action='fs2'>");
		htmlCode.append("form no :<input type='text' name='stu_form_no' value='"+System.nanoTime()+"' readonly='readonly'><br>");
		htmlCode.append("Name :<input type='text' name='stu_name'><br>");
		htmlCode.append("age :<input type='text' name='stu_age'><br>");
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