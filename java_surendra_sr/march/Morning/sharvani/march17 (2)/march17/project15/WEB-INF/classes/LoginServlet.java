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
  
 public class LoginServlet extends GenericServlet{ 
  
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

				String id  = request.getParameter("user_id");
				String password  = request.getParameter("user_password");
				
				//db connect validate
				//if  success 
				//else  fails //re login
				
				 response.getWriter().print(id +" :: " + password);
			 
	}//service
 
 }//End of class 
