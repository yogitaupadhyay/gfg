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

  //Date  09/10/2018
 public class LineSeparater{ 

 static  void separateLine(){
    System.out.println("+++++++++++++++++++++++++++++++++");
  
  }
 static  void separateLine(int totalChar){
     for(int i=1;i<=totalChar;i++){
	  System.out.print("+");
	 }
	 System.out.println();
  }
 
 
static  void separateLine(int totalChar,char whichChar){
     for(int i=1;i<=totalChar;i++){
	  System.out.print(whichChar);
	 }
	 System.out.println();
  }
 
 
 }//End of class 
