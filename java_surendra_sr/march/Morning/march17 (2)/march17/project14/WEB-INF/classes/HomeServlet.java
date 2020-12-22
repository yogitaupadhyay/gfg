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
  
 public class HomeServlet extends GenericServlet{ 
  
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

				String userName  = request.getParameter("user_name");
				userName = userName.toUpperCase();
				 java.util.Date d1  = new java.util.Date();
			  
			  
			  RequestDispatcher rd  = null;
			  rd = request.getRequestDispatcher("homeView");
			  
			  //add data  for share
			  request.setAttribute("clientName",userName);
			  request.setAttribute("enteredTime",d1);
			  ServletContext context  = getServletContext();
			  
			  context.setAttribute("clientName",userName);
			  context.setAttribute("enteredTime",d1);
			  
			  rd.forward(request,response);
			 
	}//service
 
 }//End of class 
