
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
 
   CurrentYear 2018 
 */

public class SwDemo {

	public static void main(String[] args) throws Exception {

		Software[] softwareList = { 
				new MsPaint("sis"),
				new Calculator("Calc"), 
				new Chrome("facebook.com"),
				new Calculator("Calc") 
				};

		for (Software software : softwareList) {
			System.out.println(software);
			software.execute();
			software.min();
			software.max();
			software.move(11, 22);
			software.resize();
			software.close();
			Thread.sleep(3000);
		}

	}

}
