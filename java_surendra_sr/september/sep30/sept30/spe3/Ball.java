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

  //Date  30/09/2018
 public class Ball{ 
 
    boolean isDamaged;
	
	void roll(float force, int direction){
	System.out.println("rolling..... in direction degree " +  direction);
	
	 
	if(force>=50){
	 System.out.println("rolling for 10 second");
	  try{Thread.sleep(10000);}catch(Exception e){}
	}else{
	 System.out.println("rolling for 5 second");
	  try{Thread.sleep(5000);}catch(Exception e){}
	
	}
	
	
	
	}
  
 
 void bounce(float force, int direction){
	System.out.println("bounce..... in direction degree " +  direction +"given force " + force);
	
	if(force>=1000){
	  isDamaged  = true;
	  System.out.println("ball gaya.....");
	  return ;
	}else{
	  System.out.println("ball not damaged....");
	
	}
}
 
 }//End of class 
