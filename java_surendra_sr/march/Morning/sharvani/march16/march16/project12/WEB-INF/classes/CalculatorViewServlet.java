 import java.io.*;
  import javax.servlet.*;
  
 public class CalculatorViewServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

			Integer num1  = (Integer)request.getAttribute("n1") ;
			Integer num2  = (Integer)request.getAttribute("n2") ;
			Integer plus  = (Integer)request.getAttribute("sum") ;
			Integer minus  = (Integer)request.getAttribute("sub") ;
			Integer mul = (Integer)request.getAttribute("mul") ;
			Integer mod  = (Integer)request.getAttribute("mod") ;
			Float  div = (Float)request.getAttribute("div") ;
			
			
		StringBuffer 	htmlCode  = new StringBuffer();
			htmlCode.append("<html>");	
			htmlCode.append("<body>");	
			htmlCode.append("<h1>num1  =  " +num1+"</h1>");	
			htmlCode.append("<h1>num2  =  " +num2+"</h1>");	
			htmlCode.append("<h1>sum  =  " +plus+"</h1>");	
			htmlCode.append("<h1>sub  =  " +minus+"</h1>");	
			htmlCode.append("<h1>mul  =  " +mul+"</h1>");	
			htmlCode.append("<h1>mod  =  " +mod+"</h1>");	
			htmlCode.append("<h1>div  =  " +div+"</h1>");	
			htmlCode.append("<a href='calc_form.html'>re calculate </a> ");	
			htmlCode.append("<a href='sis.html'>back to home </a> ");	
			htmlCode.append("</body>");	
			htmlCode.append("</html>");	
			
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("text/html");
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 
