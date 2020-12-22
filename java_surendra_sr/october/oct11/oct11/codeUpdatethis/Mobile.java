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
 public class Mobile{ 
  String color;
  float price;
  
  
    void update(String color,float price){
	   this.price=price;
	   this.color=color;
	}
  
  void showDetails(){
   System.out.println("++++++++++"+ this +"+++++++++++");
    System.out.println("object details " );
     System.out.println("color " + color);
     System.out.println("price " + price);
   System.out.println("+++++++++++++++++++++");
  }
  
  
 }//End of class 
