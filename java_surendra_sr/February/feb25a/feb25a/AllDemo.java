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

public class AllDemo {

	public static void main(String[] args) {
		ArrayList<Character> data1  = new ArrayList<Character>();
		data1.add('f');
		data1.add('c');
		data1.add('f');
		data1.add('z');
		data1.add('l');
		data1.add('k');
		data1.add('f');
		data1.add('d');
		System.out.println("ArrayList "+data1.size() +" " +data1);
		//8 [f, c, f, z, l, k, f, d]
		
		HashSet<Character> data2  = new HashSet<Character>();
		data2.add('f');
		data2.add('c');
		data2.add('f');
		data2.add('z');
		data2.add('l');
		data2.add('k');
		data2.add('f');
		data2.add('d');
		System.out.println("HashSet " + data2.size() +" " +data2);
		//6 [c, d, f, z, k, l]
		
		

		LinkedHashSet<Character> data3  = new LinkedHashSet<Character>();
		data3.add('f');
		data3.add('c');
		data3.add('f');
		data3.add('z');
		data3.add('l');
		data3.add('k');
		data3.add('f');
		data3.add('d');
		System.out.println("LinkedHashSet " +data3.size() +" " +data3);
		
		TreeSet<Character> data4  = new TreeSet<Character>();
		data4.add('f');
		data4.add('c');
		data4.add('f');
		data4.add('z');
		data4.add('l');
		data4.add('k');
		data4.add('f');
		data4.add('d');
		System.out.println("TreeSet "+data4.size() +" " +data4);
	}

}
