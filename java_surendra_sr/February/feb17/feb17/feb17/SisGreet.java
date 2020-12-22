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

public class SisGreet {
public static void main(String[] args) {
	
	String userName  = UserUtil.getName();
	System.out.println("welcome user "+ userName);
	
	Scanner scan = new Scanner(System.in);
	while(true) {
		 System.out.println("1 : change user name");
		 System.out.println("2 : show user name");
		 System.out.println("3 : exit");
		 int option  = Integer.parseInt(scan.nextLine());
		switch(option) {
		
		case 1:
			UserUtil.changeUserName();
		case 2:
			System.out.println("User name is " + UserUtil.getName());
			break;
		case 3:
			System.out.println("Good Bye");
			System.exit(0);
		 default : System.out.println("invalid input");	
		}
		
	}
	
	
	
	
}
}
