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
 public class Book{ 
		String name ;
		String authorName ;
		int totalPage;
		float weight;
		
		
	//void setAll(String n, String an, int tp,float w){
	void setAll(String name, String authorName, int totalPage,float weight){
	   name=name;
	   authorName = authorName;
	   totalPage=totalPage;
	   weight =weight;
	 System.out.println("inside set all----------------------");
	 System.out.println("name " + name);
    System.out.println("authorName " + authorName);
    System.out.println("totalPage " + totalPage);
    System.out.println("weight " + weight);
	   
	}	
   
   void details(){
    System.out.println("++++++++++++book Details+++++++++++++++");
    System.out.println("name " + name);
    System.out.println("authorName " + authorName);
    System.out.println("totalPage " + totalPage);
    System.out.println("weight " + weight);
   
   }
   
   
 }//End of class 
