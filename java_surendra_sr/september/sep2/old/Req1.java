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

  //Date  01/09/2018
 public class Req1 {

	public static void main(String args[]){
	
	int [] arr ={11,22,33,44,55,66,77,88,99,111,222,333,444};
	//System.out.println("[11,22,33,44,55,66,77,88,99,111,222,333,444]");
	
	String str="[";
	for(int e=1;e<=arr.length;e++){
	  str = str +arr[e-1];
	  if(e!=arr.length){
		str = str +",";
	  }
	}
	
  str  = str +"]";
System.out.println(str);  


StringBuffer sb=new StringBuffer("[");
	for(int e=1;e<=arr.length;e++){
	 sb.append(arr[e-1]);
	  if(e!=arr.length){
		sb.append(",");
	  }
	}
	
  sb.append("]");
System.out.println(sb.toString()); 


System.out.println("++++++++++++++++"); 
System.out.println(java.util.Arrays.toString(arr));


	
	  
	}//end main

}//end class