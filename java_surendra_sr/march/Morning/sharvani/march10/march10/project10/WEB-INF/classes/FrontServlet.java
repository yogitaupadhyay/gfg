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
  import java.sql.*;
  import java.io.*;
  import javax.servlet.*;
  
 public class FrontServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			PrintWriter  pw  = response.getWriter();
			pw.print("Task_A");
			System.out.println("FrontServlet  Task1");
			RequestDispatcher rd  = request.getRequestDispatcher("helper1");
			//rd.include(request,response);
			rd.forward(request,response);
			
			System.out.println("FrontServlet  Task3");
			pw.print("Task_C");
			
			
			 
	}//service
 
 }//End of class 
