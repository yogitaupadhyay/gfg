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

public class BoolTest1 {

	public static void main(String[] args) throws InvalidBooleanValueException {
		Scanner scan = new Scanner(System.in);
		boolean happy ;
		System.out.println("enter boolean value");
		//happy = Boolean.parseBoolean(scan.nextLine());
		happy = SisBoolean.parseBoolean(scan.nextLine());
		
		
		
		System.out.println(happy?"YOur Happy " :" your Not Happy");
		
		
		
		

	}

}
