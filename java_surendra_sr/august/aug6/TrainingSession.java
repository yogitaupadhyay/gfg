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

  //Date  06/08/2018
 public class TrainingSession {

	public static void main(String args[]){
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
	  boolean isPlaneAvailable;
	  boolean isTrainAvailable;
	  boolean isBusAvailable;
	  
	  System.out.println("is plane available?");
	  isPlaneAvailable  = scan.nextBoolean();
	  
	  System.out.println("is train available?");
	  isTrainAvailable  = scan.nextBoolean();
	  System.out.println("is  bus available?");
	  isBusAvailable  = scan.nextBoolean();
	  
	  
	  if(isPlaneAvailable){
	        System.out.println("plane booked");
	         //todo
	  }else if(isTrainAvailable){
	        System.out.println("train booked");
			
	  }else if(isBusAvailable){
	  
	        System.out.println("bus booked");
	  }else{
	     System.out.println("nothing..... booked");
	  }
	  
	  
	  System.out.println("_________________");
	  boolean isBooked ;
	  
	   if(isPlaneAvailable){
	     isBooked = true;
	  }else if(isTrainAvailable){
	     isBooked = true;
	  }else if(isBusAvailable){
	     isBooked = true;
	  }else{
	     isBooked = false;
	  }
	  
	  System.out.println("booked ? " + isBooked);
	  
	  
	  boolean isBooked2 ;
	  
	   if(isPlaneAvailable || isTrainAvailable
				|| isBusAvailable){
	     isBooked2 = true;
	  }else{
	     isBooked2 = false;
	  }
	  
	  System.out.println("booked ? " + isBooked2);
	  
	  
	
	  
	}//end main

}//end class