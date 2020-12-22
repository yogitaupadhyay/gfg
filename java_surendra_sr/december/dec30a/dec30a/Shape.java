
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

public abstract class Shape {
    protected String backgroundColor;
    protected String borderColor;
    
	void showDetails() {
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(this+ " details");
		System.out.println("background Color"+backgroundColor);
		System.out.println("borderColor " + borderColor);
		System.out.println("Area " + getArea());
		System.out.println("+++++++++++++++++++++++++++++++++");
	}

 
	public String getBackgroundColor() {
		return backgroundColor;
	}


	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}


	public String getBorderColor() {
		return borderColor;
	}


	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}


	public abstract double getArea();

	
    
	
}