import java.util.ArrayList;

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

public class Req1 {

	 
	public static void main(String[] args) {
	
		ArrayList<Integer> coins = new ArrayList<Integer>();
		coins.add(5);
		coins.add(1);
		coins.add(5);
		coins.add(10);
		coins.add(2);
		coins.add(5);
		coins.add(10);
		
		int totalMoney = 0;
		for(int value:coins ) {
			totalMoney +=value;
		}
		System.out.println(coins);
		System.out.println("total coins  " + coins.size());
		System.out.println("total Money   " +totalMoney);
		System.out.println(coins.contains(2));
		System.out.println(coins.contains(100));
		System.out.println(coins.indexOf(1));
		System.out.println(coins.indexOf(5));
		
		
	}

}
