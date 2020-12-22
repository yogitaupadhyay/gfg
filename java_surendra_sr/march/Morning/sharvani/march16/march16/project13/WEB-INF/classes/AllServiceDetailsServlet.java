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
  
 public class AllServiceDetailsServlet extends GenericServlet{ 
 
           
 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

				
				ServletContext context  =getServletContext();
				
			  
			StringBuffer htmlCode  = new StringBuffer();
			htmlCode.append("<html>");	
			htmlCode.append("<body>");	
			htmlCode.append("<a href='sis.html'>back to home </a> ");	
			htmlCode.append("<hr>");	
			htmlCode.append("<h1>Total Dice Service Hit  "+context.getAttribute("total_dice_hit")+"</h1> ");	
			htmlCode.append("<h1>Total Date Service Hit  "+context.getAttribute("total_date_hit")+"</h1> ");	
			
			htmlCode.append("</body>");	
			htmlCode.append("</html>");	
			
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("text/html");
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 
