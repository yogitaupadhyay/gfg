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

  //Date  15/09/2018
 public class SpeReq1 {

	public static void main(String args[]){
	
	  int [] arr ={55,33,44,77,66,11,22};
	  
	  System.out.println(arr);
	  //[ 11, 22, 33, 44, 55, 66, 77 ];
	  //way1 
	  long start1 = System.nanoTime();
	  String str  ="[ ";
	   for(int e=1;e<=arr.length;e++){
	      int data  = arr[e-1];
			  str  = str +data ;
			  if(e<arr.length){
				 str  = str +", " ;
			  }else{
				 str  = str +" " ;
			  }
	   }
	  str  = str +"]";
	  long end1 = System.nanoTime();
	  System.out.println(str);
	  
	  
	  //way 2
	  
	    long start11 = System.nanoTime();
	  StringBuffer sb   =new StringBuffer("[ ");
	   for(int e=1;e<=arr.length;e++){
	      int data  = arr[e-1];
			  sb.append(data );
			  if(e<arr.length){
			  sb.append(", ");
			  }else{
			  sb.append(" ");
			  }
	   }
			  sb.append("]");
	  
	  long end11 = System.nanoTime();
	  System.out.println(sb);
	  
	  
	   //way 2
	  
	    long start111 = System.nanoTime();
	  StringBuilder sbuild   =new StringBuilder("[ ");
	   for(int e=1;e<=arr.length;e++){
	      int data  = arr[e-1];
			  sbuild.append(data );
			  if(e<arr.length){
			  sbuild.append(", ");
			  }else{
			  sbuild.append(" ");
			  }
	   }
			  sbuild.append("]");
	  
	  long end111 = System.nanoTime();
	  System.out.println(sbuild);
	  
	  
	  
	  System.out.println("+++++++++++++++++++++++++");
	  
	  long start2 = System.nanoTime();
	  String str2 =java.util.Arrays.toString(arr);
	  long end2 = System.nanoTime();
	  System.out.println(str2);
	  
	  
	  System.out.println(" manualSTR   " +(end1-start1) +" ns");
	  System.out.println(" manual SB " +(end11-start11) +" ns");
	  System.out.println(" manual SBuild " +(end111-start111) +" ns");
	  System.out.println(" API  " +(end2-start2) +" ns");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}//end main

}//end class