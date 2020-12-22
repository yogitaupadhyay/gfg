import javax.servlet.*;
import java.util.*;
import java.io.*;
public class DateServlet implements Servlet{
	 public void init(javax.servlet.ServletConfig s) throws javax.servlet.ServletException{
		 System.out.println("init method called");
	 }
  public  javax.servlet.ServletConfig getServletConfig(){
		 return null;
  }
  public  void service(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response) throws javax.servlet.ServletException, java.io.IOException{
	  System.out.println("service method is called");
	  response.getWriter().println(new Date());
  }
  public java.lang.String getServletInfo(){
	  return "getServletInfo-date";
	  
  }
  public  void destroy(){
	  System.out.println("destroy method called");
  }
}