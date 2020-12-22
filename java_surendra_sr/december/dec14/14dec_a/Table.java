
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

public class Table {

	private String color;
	private String brandName;
	private String madeOf;
	private float price;
	private int numberOfLegs;

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

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public void info() {
		String str = "Table [\ncolor=" + color + ",\n brandName=" + brandName + ",\n madeOf=" + madeOf + ",\n price="
				+ price + ",\n numberOfLegs=" + numberOfLegs + "]";
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println(str);
		System.out.println("++++++++++++++++++++++++++++");
	}

	public void fold() {
		System.out.println(this + " folded");
	}

	public void unFold() {
		System.out.println(this + " un-folded");
	}

}
