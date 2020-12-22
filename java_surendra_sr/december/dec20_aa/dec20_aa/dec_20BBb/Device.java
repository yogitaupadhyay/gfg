
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

public class Device {
	String brandName;
	float weight;
	float price;
	boolean isOn;

	public Device(String brandName, float weight) {
		this.brandName = brandName;
		this.weight = weight;
		System.out.println(this +" created  2 args ");
	}

	void on() {
		System.out.println(this  + " on");
	}
	
	void off() {
		System.out.println(this  + " on");
	}
}
