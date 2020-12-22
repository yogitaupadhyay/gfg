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
  
 public class HtmlCreatorHelper extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			
				Object obj  = request.getAttribute("datalist");
				List<Integer>list  = (List<Integer>)obj;
			 Date d1 =(Date) request.getAttribute("request_time");
			
			PrintWriter  pw  = response.getWriter();
			response.setContentType("text/html");
					//html code
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<h1>"+d1+"</h1>");
			  pw.print("<table border=\"5\">");
			  pw.print("<tr><th>sno</th><th>data</th></tr>");
			  for(int n=1; n<=list.size();n++){
				  int data  = list.get(n-1);
				pw.print("<tr><td>"+n+"</td><td>"+data+"</td></tr>");
				}
			  
			  pw.print("</table>");
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 
