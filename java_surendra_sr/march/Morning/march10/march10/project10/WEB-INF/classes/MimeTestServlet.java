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
  
 public class MimeTestServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			
			String format  =request.getParameter("format");
			ArrayList<Integer>list = new ArrayList<Integer>();
			for(int a=1;a<=10;a++){
				list.add((int)(Math.random()*1000));
			}
			
			
			
			PrintWriter  pw  = response.getWriter();
			//set content type
			//response.setContentType("text/html");
			if("excel".equals(format)){
				response.setContentType("application/vnd.ms-excel");
				 for(int n=1; n<=list.size();n++){
				  int data  = list.get(n-1);
				  pw.print(n+"\t"+data +"\n");
				}

			}else if("text".equals(format)){
				response.setContentType("text/plain");
				for(int n=1; n<=list.size();n++){
				  int data  = list.get(n-1);
				  pw.print(n+"\t"+data +"\n");
				}
			}else if("html".equals(format)){
				response.setContentType("text/html");
					//html code
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<table border=\"5\">");
			  pw.print("<tr><th>sno</th><th>data</th></tr>");
			  for(int n=1; n<=list.size();n++){
				  int data  = list.get(n-1);
				pw.print("<tr><td>"+n+"</td><td>"+data+"</td></tr>");
				}
			  
			  pw.print("</table>");
			  pw.print("</body>");
			  pw.print("</html>");
				
			}
			 
			
			
			 
	}//service
 
 }//End of class 
