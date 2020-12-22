
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

public class FormTest1 {

	 
	public static void main(String[] args) {
		 
		SisStudentForm form  = null;
		
		
		try {
			SisTrainer.process(form);
			System.out.println("Form Submited");
		} catch (EmptyFormException e) {
			System.out.println("Form ERROR "+e.getMessage());
			e.printStackTrace();
		} catch (EmptyNameException e) {
			System.out.println("Form ERROR "+e.getMessage());
			e.printStackTrace();
		} catch (NameLengthEception e) {
			System.out.println("Form ERROR "+e.getMessage());
			e.printStackTrace();
		} catch (InvalideNameException e) {
			System.out.println("Form ERROR "+e.getMessage());
			e.printStackTrace();
		} catch (NegativeAgeExeption e) {
			System.out.println("Form ERROR "+e.getMessage());
			e.printStackTrace();
		} catch (AgeLimitException e) {
			System.out.println("Form ERROR "+e.getMessage());
			e.printStackTrace();
		} catch (EmailException e) {
			System.out.println("Form ERROR "+e.getMessage());
			e.printStackTrace();
		}
		
		
		

	}

}
