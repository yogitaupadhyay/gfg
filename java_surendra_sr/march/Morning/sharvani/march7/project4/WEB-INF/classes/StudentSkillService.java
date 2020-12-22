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
  
 public class StudentSkillService extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			
			String studentName = request.getParameter("stu_name");
			String skillsList[] = request.getParameterValues("stu_skills");

			//db TODO
			 
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<h1 >Student Name : "+studentName+"</h1>");
			  pw.print("<a href='sis.html' >back to home</a>");
			  if(skillsList!=null){
				pw.print("<h1 >total Skills = "+skillsList.length+"</h1>");
			       for(int s=1;s<=skillsList.length;s++){
				       String str  = skillsList[s-1];
					pw.print("<h1 >sno#"+s+" = "+str+" </h1>");
				     
				   }
			  }else{
				pw.print("<h1 >No skills selected </h1>");
				pw.print("<h1 >plz select skill or join sis </h1>");
			   
			  }
			  
			  
			  
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 
