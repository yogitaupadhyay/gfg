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

  //Date  16/09/2018
 public class NumberSuffle2 {

	public static void main(String args[])throws Exception{
	
	   int [] list ={11,22,33,44,55,66,77,88,99};
	   System.out.println(java.util.Arrays.toString(list));
	   
	   java.util.Random rand  = new java.util.Random();
	    for(int e=1;e<=list.length;e++){
			int swapIndexPos  = rand.nextInt(list.length);	//0 
			int temp  = list[e-1];
				list[e-1] = list[swapIndexPos];
				list[swapIndexPos] = temp;		
	   System.out.println("round #"+ e + java.util.Arrays.toString(list));
	   Thread.sleep(1000);
	   }
	   
	   
	   
	   System.out.println("++++++++++++++++++++++++++++++++++");
	   System.out.println(java.util.Arrays.toString(list));
	   
	   
	  
	}//end main

}//end class