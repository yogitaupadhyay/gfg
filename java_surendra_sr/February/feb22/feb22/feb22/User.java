import java.util.Arrays;


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

public class User {
	private String name;
	private Integer[] rolledData = new Integer[100];

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer[] getRolledData() {
		return rolledData;
	}

	public void showDiceData() {
		
		System.out.println(name  +" data "+Arrays.toString(rolledData));
		System.out.println(name  +" total sum "+ totalSum());
	}

	public void updateData(int diceNumber) {
		for(int pos=1;pos<=rolledData.length;pos++) {
			if(rolledData[pos-1]==null) {
				//rolledData[pos-1] = new Integer(diceNumber);
				rolledData[pos-1] = diceNumber;
				showDiceData();
				break;
			} 
		}
		
		
	}

	public boolean isComplete() {
		int sum = totalSum();
		return sum>=100;
	}

	private int totalSum() {
		int sum  = 0;
		for(int pos=1;pos<=rolledData.length;pos++) {
			if(rolledData[pos-1]!=null) {
				sum  = sum  +rolledData[pos-1];
			}
		}
		return sum;
	}
}
