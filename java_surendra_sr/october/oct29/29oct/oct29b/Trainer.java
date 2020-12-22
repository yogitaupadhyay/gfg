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

  //Date  01/10/2018
 public class Trainer extends Student{ 
  
	
	
	void teach(){
	  System.out.println(this  + " teaching T " ) ;
	}
	
	@Override
	void speak(){
	  System.out.println( this+ " speak.......T");
	}
	 
	@Override
	 void read(){
	  System.out.println(  this+ " reading....T");
	}
	
	@Override
	void write(){
	  System.out.println( this+ " writing.......T");
	}
	 
	
 }//End of class 
