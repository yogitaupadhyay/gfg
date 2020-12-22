import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

public class SpeDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("ddd");
		list.add("ccc");

		Set<String> set = new HashSet<String>();

		set.add("yyyy");
		set.add("ffff");
		set.add("oooo");
		set.add("mmmm");
		
		
		
		//list o set
		Set<String> mySet1 = new HashSet<String>(list);
		System.out.println(mySet1);
		
		List<String> myList1 = new ArrayList<String>(set);
		System.out.println(myList1);
		
		Integer arr[] = {22,33,44,55};
		List<Integer> myList2 =Arrays.asList(11,22,33,44,55);
		List<Integer> myList3 =Arrays.asList(arr);
		System.out.println(myList2);
		System.out.println(myList3);
		
		//collecton list set  to array
		
		System.out.println(list);
		System.out.println(list.size());
		Object[] arrAbc = list.toArray();
		System.out.println(arrAbc);
		System.out.println(Arrays.toString(arrAbc));
		System.out.println(arrAbc.length);
		
		/*{
			{11,22,33,},
			{44,55,66,6},
			{77,66},
		}*/
		 

	}

}
