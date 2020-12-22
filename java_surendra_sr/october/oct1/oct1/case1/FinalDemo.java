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
 public class FinalDemo {

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
		
		
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		
		while(true){
		   //todo show option
		   System.out.println("which operation you want to perform");
		   System.out.println("0: about book  details");
		   System.out.println("1: first");
		   System.out.println("2: last ");
		   System.out.println("3: next");
		   System.out.println("4: prev");
		   System.out.println("5: goto page ");
		   System.out.println("6:  exit");
		   
		   int action = scan.nextInt();
		   switch(action){
		   case 0:  book1.about();   break;
		   case 1:  book1.first();   break;
		   case 2:  book1.last();   break;
		   case 3:  book1.next();   break;
		   case 4:  book1.prev();   break;
		   case 5: 
		       System.out.println("enter page no bw 1-" + book1.getTotalPage());
				int pageNo  = scan.nextInt();
		        book1.jumpPage(pageNo);  

		   break;
		   case 6: 
              System.out.println("book reading stoped"); 
			  System.exit(0);
		   break;
		   default : System.out.println("invalid option " + action); break;
		   }//switch
		   
		   System.out.println("@@@@@@@@@@@@@@@@@@@@");
		}//loop
	  
	}//end main

}//end class