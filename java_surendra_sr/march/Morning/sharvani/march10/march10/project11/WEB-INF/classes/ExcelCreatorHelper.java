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
  
 public class ExcelCreatorHelper extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			Object obj  = request.getAttribute("datalist");
			List<Integer>list  = (List<Integer>)obj;
			 Date d1 =(Date) request.getAttribute("request_time");
			PrintWriter  pw  = response.getWriter();
			response.setContentType("application/vnd.ms-excel");
			
				  pw.print("SNO"+"\t"+"data" +"\t"+("data^2")+"\n");
				 for(int n=1; n<=list.size();n++){
				  int data  = list.get(n-1);
				  pw.print(n+"\t"+data +"\t"+(data*data)+"\n");
				}
				  pw.print("request tim e" +d1+"\n");
	}//service
 
 }//End of class 
