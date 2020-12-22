
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

public class Ball {
  private String color;
  private String brandName;
  private float price;
  private float weight;

  public Ball() {
		String color = "green";
		String brandName = "sis";
		float price = 300;
		float weight = 200;

		this.color = color;
		this.brandName = brandName;
		this.price = price;
		this.weight = weight;
  }
  
  public Ball(String color, String brandName, float price, float weight) {
	this.color = color;
	this.brandName = brandName;
	this.price = price;
	this.weight = weight;
  }

  
  public void roll() {
	  System.out.println("rolling.....");
  }
  
  public void bounce() {
	  System.out.println("rolling.....");
  }
  
  
  
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getBrandName() {
	return brandName;
}

public void setBrandName(String brandName) {
	this.brandName = brandName;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}
  
  
  
  
  
  @Override 
   public String toString(){
    String msg  =String.format("%15s %15s %10.2f %10.2f",color,brandName,price,weight);
	return msg;
	}


}//class