 import java.io.*;
  import javax.servlet.*;
  
 public class CalculatorController extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			
			 	
			String str1  =request.getParameter("n1");
			String str2  =request.getParameter("n2");
			
			StringBuffer errorSb  = new StringBuffer();
			 //empy
			 if(str1.trim().isEmpty()){
				errorSb.append("<h1 style='color:red;'>1st number must not be empty</h1>");
			 }
			 if(str2.trim().isEmpty()){
				errorSb.append("<h1 style='color:red;'>2nd  number must not be empty</h1>");
			 }
			 
			
			 
			 //invalid number 
			 Integer n1 = null;
			 Integer n2 = null;
			 try{
			     n1  = Integer.parseInt(str1);
			     n2  = Integer.parseInt(str2);
			 }catch(NumberFormatException e){
				errorSb.append("<h1 style='color:red;'>both  number must not be integer number</h1>");
			 }catch(Exception e){
				errorSb.append("<h1 style='color:red;'>both  number must not be integer number</h1>");
			 }
			 
			 
			  if(errorSb.length()>0){
				response.getWriter().print(errorSb);
				response.getWriter().print("<hr>");
				RequestDispatcher rd  = request.getRequestDispatcher("calc_form.html");
				rd.include(request,response);
				return ;
			 }
			 
			 
			 Integer sum = n1 +n2;
			 Integer sub  = n1 -n2;
			 Integer mul  = n1 *n2;
			 Integer mod  = n1 %n2;
			 float div  = n1 /n2;
			 
			request.setAttribute("n1",n1) ;
			request.setAttribute("n2",n2) ;
			request.setAttribute("sum",sum) ;
			request.setAttribute("sub",sub) ;
			request.setAttribute("mul",mul) ;
			request.setAttribute("mod",mod) ;
			request.setAttribute("div",div) ;
			
			RequestDispatcher rd  = request.getRequestDispatcher("calcViewHelper");
			rd.include(request,response);
			
			
			
			 
	}//service
 
 }//End of class 
