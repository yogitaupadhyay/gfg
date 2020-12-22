import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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

public class AddServlet extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String wordkey = request.getParameter("word");
		String detailsvalue = request.getParameter("details");
		Cookie c1  = new Cookie(wordkey, detailsvalue);
		response.addCookie(c1);
		
		
        StringBuffer htmlCode = new StringBuffer();
		htmlCode.append("<html>");
		htmlCode.append("<head>");
		htmlCode.append("<title>dept</title>");
		htmlCode.append("</head>");
		htmlCode.append("<body>");
		htmlCode.append("<h1>your info added</h1><hr>");
		htmlCode.append("<h1>"+wordkey+"= "+detailsvalue+"</h1><hr>");
		
		htmlCode.append("<a href='showinfo'>show all info</a><hr>");
		htmlCode.append("<a href='add_info.html'>add more info</a><hr>");
		htmlCode.append("</body>");
		htmlCode.append("</html>");
		
		
		//how to print into browser
		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		pw.print(htmlCode);
		
        
		
		
		
	}

}
