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
 public class Sun{ 
     private static int totalSun;
   private Sun(){
    totalSun++;
     System.out.println(this  + " created...." + totalSun);
   }
   
   
//NOT GOOD   public Sun getSun(){  //without object we can not call it
  
  private static Sun obj;
  
 // public  static  Sun getSun(){
  //public  static  Sun getSunObject(){
  //public  static  Sun getObject(){
  //public  static  Sun getInstance(){
  public  static  Sun getSun(){
  
		 if(obj==null){    
				obj  = new Sun();
		}
   return obj;
   }
   
   
 }//End of class 
