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

  //Date  18/10/2018
 public class Moon{ 
 
 private static Moon moonObj;
 
 private Moon(){ 
  System.out.println(this  + " object created");
 }
 
 public static Moon  getInstance(){
 
     if(moonObj==null){
	   moonObj  = new Moon();
	 }
 
 return moonObj;
 } 
   
   
   
   
   
   
 }//End of class 
