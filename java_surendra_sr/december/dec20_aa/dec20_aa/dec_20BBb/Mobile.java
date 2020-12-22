
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

public class Mobile extends Device{
    String os;
    int ram;
    Camera camera;
	 
	public Mobile(String os, int ram,String brandName, float weight,int megaPixel) {
		super(brandName, weight);
		this.os =os;
		this.ram =ram;
		camera  = new Camera(megaPixel);
		System.out.println(this  +" created 5 args");
	}
    
	
   void allDetails() {
	   System.out.println("++++++++"+this+"++++++++");
	   System.out.println("brandName " +brandName );
	   System.out.println("os " + os);
	   System.out.println("ram " + ram);
	   System.out.println("weight " + weight);
	   System.out.println("megaPixel " + camera.megaPixel);
	   System.out.println("price " + price);
	   
   }	
	
    
}
