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
 public class Test3 {

	public static void main(String args[]){
	 java.util.Random rand  = new java.util.Random();
	 final int size  = rand.nextInt(6)+5;
	 
	 int [] dataSet  = new int[size];
	 
	  System.out.println("total element  = " + size);
	  for(int dataNumber=1;dataNumber<=size;dataNumber++){
		System.out.println( dataNumber+"#"   + dataSet[dataNumber-1]);
	  }
	  
	  //fill
	  
	    for(int dataNumber=1;dataNumber<=size;dataNumber++){
		  dataSet[dataNumber-1] = rand.nextInt(1001)+1;
	  }
	  
	  
	  System.out.println("+++++++++++++++++++++");
	  //after fill
	  for(int dataNumber=1;dataNumber<=size;dataNumber++){
		System.out.println( dataNumber+"#"   + dataSet[dataNumber-1]);
	  }
	  
	  
	}//end main

}//end class