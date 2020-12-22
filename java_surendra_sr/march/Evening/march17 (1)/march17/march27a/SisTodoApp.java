import java.util.Scanner;

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
 
   CurrentYear 2019 
 */

public class SisTodoApp {
  public static void main(String[] args) {
	  Scanner scan  = new 	  Scanner(System.in);
	while(true) {
		System.out.println("+++++++++++++++++++");
		  System.out.println("1:show all");
		  System.out.println("2:add");
		  System.out.println("3:update");
		  System.out.println("4:delete");
		  System.out.println("5:exit");
	   System.out.println("++++++select option+++++++++++++");
		int option = Integer.parseInt(scan.nextLine());
		switch(option) {
		case 1:
			 SisTodoUtil.showAll();
		break;	
		case 2:
			SisTodoUtil.addDodo();
			break;	
		case 3:
			SisTodoUtil.updateDodo();
			break;	
		case 4:
			break;	
		case 5:System.out.println("bye");
			System.exit(0);
			break;	
		default :System.out.println("invalid input");
			break;	
		
		}
		
		
	}
	  
	  
	  
	  
}

 
private static void showOptions() {
	System.out.println("+++++++++++++++++++");
	  System.out.println("1:show all");
	  System.out.println("2:add");
	  System.out.println("3:update");
	  System.out.println("4:delete");
	  System.out.println("5:exit");
   System.out.println("+++++++++++++++++++");
	
}
}
