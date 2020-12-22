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

  //Date  11/10/2018
 public class Box{ 
 
   float height;
   float width;
   float length;
   String color;
   
   //void updateAll(float h,float w,float l, String c){
   void updateAll(float height,float width,float length, String color){
      this.height=height;
	   this.width=width;
	   this.length=length;
	   this.color=color;
	   
   }
   
   
   void details(){
    System.out.println("++++++++++++obj Details+++++++++++++++");
    System.out.println("color " + color);
    System.out.println("height " + height);
    System.out.println("width " + width);
    System.out.println("length " + length);
   
   }
   
   
 }//End of class 
