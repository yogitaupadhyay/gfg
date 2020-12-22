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

public class StudentFormApp {

	 
	public static void main(String[] args) {
		 
		SisStudentForm form  = null;
		form = new SisStudentForm();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		form.setName(scan.nextLine());
		System.out.println("enter your age");
		form.setAge(Integer.parseInt(scan.nextLine()));
		System.out.println("enter your email");
		form.setEmail(scan.nextLine());
		
		while(true) {
		
				try {
					SisTrainer.process(form);
					System.out.println("**************Form Submitted successfuly*****************");
					break;
					
				} catch (EmptyFormException e) {
					System.out.println("Form ERROR "+e.getMessage());
					form = new SisStudentForm();
				} catch (EmptyNameException e) {
					System.out.println("Form name ERROR "+e.getMessage());
					System.out.println("re-enter your name");
					form.setName(scan.nextLine());
				} catch (NameLengthEception e) {
					System.out.println("Form name ERROR "+e.getMessage());
					System.out.println("re-enter your name");
					form.setName(scan.nextLine());
				} catch (InvalideNameException e) {
					System.out.println("Form ERROR "+e.getMessage());
					System.out.println("re-enter your name");
					form.setName(scan.nextLine());
				} catch (NegativeAgeExeption e) {
					System.out.println("Form Age ERROR "+e.getMessage());
					form.setAge(Integer.parseInt(scan.nextLine()));
				} catch (AgeLimitException e) {
					System.out.println("Form Age ERROR "+e.getMessage());
					form.setAge(Integer.parseInt(scan.nextLine()));
				} catch (EmailException e) {
					System.out.println("Form Email ERROR "+e.getMessage());
					form.setEmail(scan.nextLine());
				}
		
		
		}//end while	
		
		

	}

}
