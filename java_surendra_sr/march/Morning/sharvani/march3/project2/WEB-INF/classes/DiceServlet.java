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
  
  
 public class DiceServlet  implements Servlet{ 
 public  DiceServlet(){ 
   System.out.println(this  + " object creteate and ready for use");
 }
 ServletConfig config;
  public   void init(ServletConfig config) throws  ServletException{
    System.out.println("init method called DiceServlet");
	this.config = config;
  
  }
 public   void destroy(){
  System.out.println("destory method called DiceServlet");
 }
 public   void service( ServletRequest request, ServletResponse response) 
 throws  ServletException,IOException{
  java.util.Random rand  = new java.util.Random();
  
  int dice1 =rand.nextInt(6)+1;
  int dice2 =rand.nextInt(6)+1;
  
  PrintWriter  pw  = response.getWriter();
  pw.print("<html>");
  pw.print("<body bgcolor='black' text='white'>");
  pw.print("<h1>1st Dice Number= "+dice1+"</h1>");
  pw.print("<hr>");
  pw.print("<h1>1st Dice Number= "+dice2+"</h1>");
  pw.print("</body>");
  pw.print("</html>");
  
 
 }
 
 
 
 
 public    ServletConfig getServletConfig(){
 //return null;
 return config;
 }
 
 
 public    String getServletInfo(){
   return "this is dice service servlet";
 }



 
 
 // todo
 }//End of class 
