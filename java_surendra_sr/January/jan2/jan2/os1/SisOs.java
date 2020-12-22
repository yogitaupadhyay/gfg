
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
	
	public void printingService() {
		
		SisPrinter printer = null;
		printer =new SisPrinter();
		printer.connect();
		printer.print("java is Simple");
		printer.disConnect();
		
		
	}
	
	
}
