import java.util.Random;


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
 
   CurrentYear 2018 
 */

public class Demo0 {
public static void main(String[] args) throws Exception{
	
	 
	 Human  href= null;
	 
	    href= new Trainer();
	    
	    
	    System.out.println(href);
	    System.out.println(href instanceof Trainer);//true
	    System.out.println(href instanceof Student);//true
	    System.out.println(href instanceof Human);//true
	    System.out.println(href instanceof Singer);//false
	    System.out.println(href instanceof Dancer);//false
	    System.out.println("+++++++++++");
	    href=new Human();
	    System.out.println(href);
	    System.out.println(href instanceof Human);
	    System.out.println(href instanceof Student);
	    System.out.println(href instanceof Trainer);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
