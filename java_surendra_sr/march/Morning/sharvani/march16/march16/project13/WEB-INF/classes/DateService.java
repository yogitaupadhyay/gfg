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
 */

 
  import java.util.*;
  import java.io.*;
  import javax.servlet.*;
  
 public class DateService extends GenericServlet{ 
 
           private  int totalHit =0;			// instance hit stack
 
 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

				
		 java.util.Date now= new 	 java.util.Date();
			  
			StringBuffer htmlCode  = new StringBuffer();
			htmlCode.append("<html>");	
			htmlCode.append("<body>");	
			htmlCode.append("<a href='sis.html'>back to home </a> ");	
			htmlCode.append("<hr>");	
			++totalHit;
			
 
		ServletContext context  =getServletContext();
		context.setAttribute("total_date_hit",totalHit);
							
			htmlCode.append("<h1>Total Hit Of Date Service"+  totalHit  +"</h1>");	
			htmlCode.append("<h1>Today date and time is  "+now+"</h1> ");	
			 java.text.SimpleDateFormat sdf  = new 	 java.text.SimpleDateFormat("dd-MM-yyyy");
			htmlCode.append("<h1>Today date and time is  "+sdf.format(now)+"</h1> ");	
			sdf.applyPattern("EEE dd/MMM/yyyy");
			htmlCode.append("<h1>Today date and time is  "+sdf.format(now)+"</h1> ");	
			sdf.applyPattern("EEEE dd/MMMM/yyyy");
			htmlCode.append("<h1>Today date and time is  "+sdf.format(now)+"</h1> ");	
			
			htmlCode.append("</body>");	
			htmlCode.append("</html>");	
			
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("text/html");
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 
