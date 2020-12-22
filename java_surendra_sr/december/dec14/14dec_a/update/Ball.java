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
 */

//Date  14/12/2018
public class Ball {


	private String color;// null;
	private String type;// null
	private float weight;// 0.0
	private float price;//0.0

	  Ball(){
	  System.out.println(this +" created with no arg constructor");
	   color="red";
	   type="plastic";
	   weight =100;
	}
	
	
	  Ball(String color){
	  System.out.println(this +" created with 1 arg constructor");
	   //color="red";
	   this.color=color;
	   type="plastic";
	   weight =100;
	}

	
	  Ball(String color,String type,float weight){
	  System.out.println(this +" created with 3 arg constructor");
	   
	   this.color=color;
	   this.type=type;
	   this.weight = weight;
	}

	
	void showDetails(){
	System.out.println("______________________________");
	   System.out.println(this +"  details");
	   System.out.println("color "+ color) ;
	   System.out.println("price "+ price) ;
	   System.out.println("type "+ type) ;
	   System.out.println("weight "+weight ) ;
	System.out.println("______________________________");
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
 
	public float getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}// End of class
