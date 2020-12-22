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

  //Date  25/08/2018
 public class Test2 {

	public static void main(String args[]){
	 
	 int [] dataSet  = new int[5];
	 System.out.println(dataSet);
	  
	  //how to access data element
	  System.out.println(dataSet[0]);
	  System.out.println(dataSet[1]);
	  System.out.println(dataSet[2]);
	  System.out.println(dataSet[3]);
	  System.out.println(dataSet[4]);
	  
      dataSet[0] = 11;	
      dataSet[1] = 22;	
      dataSet[2] = 33;	
      dataSet[3] =44 ;	
      dataSet[4] = 55;	

	
	System.out.println("+++++++++++++++++++++");
	System.out.println(dataSet[0]);
	  System.out.println(dataSet[1]);
	  System.out.println(dataSet[2]);
	  System.out.println(dataSet[3]);
	  System.out.println(dataSet[4]);
	  
	  
	  for(int dataNumber=1;dataNumber<=5;dataNumber++){
	  
	  System.out.println( "sno#"  +dataNumber+"  = "   + dataSet[dataNumber-1]);
	  
	  }
	  
	  
	  
	  
	  
	}//end main

}//end class