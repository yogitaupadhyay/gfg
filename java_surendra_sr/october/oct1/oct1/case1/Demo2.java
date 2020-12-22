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

  //Date  01/10/2018
 public class Demo2 {

	public static void main(String args[]){
	
	 TextBook  book1  = new TextBook();
	 System.out.println(book1);
	 book1.name ="java";
	 book1.price=500;
	 book1.authorName="sk";
	 
	 String [] pageList  = new String[5];
	 pageList[0]="java is PI";
	 pageList[1]="java is OOP";
	 pageList[2]="java is Robust";
	 pageList[3]="java is Secure";
	 pageList[4]="java is Multithreaded";
	 
	 book1.pages= pageList;
	 
	 book1.about();
	  
	 book1.first(); 
	 book1.last(); 
	 book1.next(); 
	 System.out.println("+++++++++++");
	 book1.jumpPage(100);
	 book1.jumpPage(3);
	 
	 
	 
	 
	  
	}//end main

}//end class