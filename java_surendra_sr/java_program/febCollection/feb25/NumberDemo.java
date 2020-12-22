import java.util.*;

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

public class NumberDemo {

	public static void main(String[] args) {
		ArrayList<Integer> data1  = new ArrayList<Integer>();
		data1.add(200);
		 data1.add(new Integer(20));
		data1.add(new Integer(4790));
		data1.add(new Integer(249));
		data1.add(new Integer(2377));
		data1.add(200);
		System.out.println("ArrayList "+data1.size() +" " +data1);
		//8 [f, c, f, z, l, k, f, d]
		
		int totalData=0;
		for(Integer data:data1){
			totalData=totalData+data;
			
		}
		System.out.println("totalData"+totalData);
		System.out.println("200="+data1.indexOf(200));
		System.out.println("contains="+data1.contains(2377));
		System.out.println("contains="+data1.contains(277));
		System.out.println("last200="+data1.lastIndexOf(200));
		

		
	}

}
