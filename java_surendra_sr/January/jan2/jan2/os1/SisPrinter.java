
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

public class SisPrinter {
   
	public void connect() {
		System.out.println(this +" printer connected");
	}
	public void print(Object data) {
		System.out.println("printing....start");
		System.out.println(data.toString());
		System.out.println("printing....end");
	}
	
	public void disConnect() {
		System.out.println(this +" printer dis-connected");
	}
	
	
}
