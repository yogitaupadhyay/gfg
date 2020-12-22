
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

public class SisOs {
		
	public void start() {
		System.out.println("Sis Os Started.....");
	}
	public void reStart() {
		System.out.println("Sis Os reStarting.....");
	}
	public void shutDown() {
		System.out.println("Sis Os shutdown.....");
	}
	
	public void printingService() throws Exception{
  
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		System.out.println("Which Printer you want to Use");
		String className  = scan.nextLine();
		Class c  = Class.forName(className);
		Object obj  = c.newInstance();
	
		if(obj instanceof SisPrinter){
		SisPrinter printer = (SisPrinter)obj;

		printer.connect();
		printer.print("java is Simple \n Happy Programming \n Success Is Sure if You Want");
		printer.disConnect();
		}else{
		  System.out.println("Invalid Printer Driver ");
		}
		
	}
	
	
}
