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
  
 public class DiceService extends GenericServlet{ 
 
           private  int totalHit =0;			// instance hit stack
 
 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

				
			java.util.Random rand  = new java.util.Random();
			int diceNumber  = rand.nextInt(6)+1;
			
            //int totalHit =0;			 local hit stack
			  
			StringBuffer htmlCode  = new StringBuffer();
			htmlCode.append("<html>");	
			htmlCode.append("<body>");	
			htmlCode.append("<a href='sis.html'>back to home </a> ");	
			htmlCode.append("<hr>");	
			
			++totalHit  ;
		ServletContext context  =getServletContext();
		context.setAttribute("total_dice_hit",totalHit);
			
			htmlCode.append("<h1>Total Hit Of Dice Service"+  totalHit  +"</h1>");	
			htmlCode.append("<h1>dice number is "+diceNumber+"</h1> ");	
			 
			
			htmlCode.append("</body>");	
			htmlCode.append("</html>");	
			
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("text/html");
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 
