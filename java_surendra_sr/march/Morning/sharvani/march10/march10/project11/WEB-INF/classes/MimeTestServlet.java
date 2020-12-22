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
			
			List<Integer>list = new ArrayList<Integer>();
			for(int a=1;a<=10;a++){
				list.add((int)(Math.random()*1000));
			}
			

			request.setAttribute("datalist",list);
			request.setAttribute("request_time",new java.util.Date());
			
			
			RequestDispatcher rd  = null;
			if("excel".equals(format)){
				rd =	request.getRequestDispatcher("excelhelper");
			}else if("text".equals(format)){
				rd =	request.getRequestDispatcher("texthelper");
			}else if("html".equals(format)){
				rd =	request.getRequestDispatcher("htmlhelper");
			}
			 
			rd.forward(request,response);	
			
			
			 
	}//service
 
 }//End of class 
