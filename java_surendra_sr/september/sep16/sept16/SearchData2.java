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
 public class SearchData2 {

	public static void main(String args[]){
	  
	  int [] list  = {66,77,44,11,22,33,55,88,99,9,45,232,65,7778,33,99};
	   

	   for(int e=1;e<=list.length;e++){
	     System.out.println("sno#"+e  +" = " + list[e-1]);
	   
	   }
	  
	  System.out.println("++++++++++++++++++++++++++");
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println("which number you want to search ?");
	  int searchElement  = scan.nextInt();
	  int foundIndexPosition = -1;
	  
	   for(int e=1;e<=list.length;e++){
	      if(list[e-1] == searchElement){
				 foundIndexPosition = e-1;
			break;
		  }
	   }
	  

		if(foundIndexPosition>=0){
		 System.out.println("element   found at  " + (foundIndexPosition+1));
		}else{
		 System.out.println("element not found");
		}
	  
	  
	  
	  
	  
	}//end main

}//end class