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

  //Date  02/10/2018
 public class SisUtil{ 
   
   //void swapNumber(int a, int b){
   void swapNumber(DataContainer dc){
   
     System.out.println("swapNumber before  a  = " + dc.a  +" b = " + dc.b);
	  
	  int temp  = dc.a;
	  dc.a  =dc.b;
	  dc.b  =temp;
     System.out.println("swapNumber after  a  = " + dc.a  +" b = " + dc.b);
	   
   }
   
   
  // void updateValue(int a){ //OLD Version 
  
   void updateValue(Box box1){
     System.out.println("change method"+box1);
   System.out.println("updateValue() before update  a= " + box1.a);
       box1.a  = box1.a +1;
   System.out.println("updateValue()after update  a= " + box1.a);
   
   }
   
   
   
 }//End of class 
