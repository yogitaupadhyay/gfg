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

  //Date  05/08/2018
 public class NumDemo1 {

	public static void main(String args[]){
	
	  int num=123;
	  int temp  = num;
	  
	  int d3;//100
	  int d2;//10
	  int d1;//1
	  d1  = temp %10;   //3
	  temp = temp /10;   //12
	  
	  d2  = temp %10;   //2
	  temp = temp /10;   //1
	  
	  d3  = temp %10;   //1
	  
	  int digitSum  = d3 + d2+ d1;
	  int rev  = 100 *d1  + 10 *d2  + 1 * d3;
	  
	  System.out.println(num);
	  System.out.println(digitSum);
	  System.out.println(rev);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}//end main

}//end class