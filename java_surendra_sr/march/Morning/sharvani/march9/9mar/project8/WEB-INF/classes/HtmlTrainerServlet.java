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
  
 public class HtmlTrainerServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
	
			//String projectName="Surendra IT Solution";
			//String imageLogo="sis_logo2.png";
			 ServletContext context  = getServletContext();
			 String projectName=context.getInitParameter("project_name");
			 String imageLogo=context.getInitParameter("project_logo");
			
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  
			   pw.print("<h1>" + projectName+"</h1>");
			   pw.print("<img src=\'"+imageLogo+"\' height='100' width='100'>");
			  pw.print("<a href='sis.html' >back to home</a><hr>");
			  pw.print("<h1>Welcome to Html Trainer Service</h1>");
			  
			  pw.print("<hr size='6' color='red'>");
			  ServletConfig config = getServletConfig();
			  String trainerName=config.getInitParameter("trainer_name");
			  String trainerMobile=config.getInitParameter("mobile");
			  String trainerTopic1=config.getInitParameter("topic1");
			  String trainerTopic2=config.getInitParameter("topic2");
			  String msg=config.getInitParameter("msg");
			  
			  pw.print("<h1>Trainer name ="+trainerName+"</h1>");
			  pw.print("<h1>Trainer  moble ="+trainerMobile+"</h1>");
			  pw.print("<h1>Trainer Topic1 ="+trainerTopic1+"</h1>");
			  pw.print("<h1>Trainer Topic2 ="+trainerTopic2+"</h1>");
			  pw.print("<h1>Trainer msg ="+msg+"</h1>");
			  
			  
			  
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 
