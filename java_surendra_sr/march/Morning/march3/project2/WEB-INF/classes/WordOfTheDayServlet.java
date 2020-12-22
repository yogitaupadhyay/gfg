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

  //Date  03/03/2019
  import java.util.*;
  import java.io.*;
  import javax.servlet.*;
  
 public class WordOfTheDayServlet extends GenericServlet{ 
 public   void service(ServletRequest req, ServletResponse response) 
			throws  ServletException, IOException{
			String arr[]=  {"java","mobile","nit","career","sis","laptop","salary"};
		     Random rand  = new  Random();
			int index  = rand.nextInt(arr.length); // 0 size-1
			String word = arr[index];
			//html code
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<h1 >today "+new Date()+"</h1>");
			  pw.print("<h1 >word = "+word+"</h1>");
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 
