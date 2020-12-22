import java.util.HashMap;

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

public class MapDemo {

	 
	public static void main(String[] args) {
		 
		HashMap<Integer,String> map  = new HashMap<Integer,String>();
		map.put(new Integer(1), new String("one"));
		map.put(new Integer(2), new String("two"));
		System.out.println(map);
		System.out.println(map.get(new Integer(1)));
		System.out.println(map.get(new Integer(5)));
		
		
		HashMap<SisInteger,String> map2  = new HashMap<SisInteger,String>();
		map2.put(new SisInteger(1), new String("one"));
		map2.put(new SisInteger(2), new String("two"));
		System.out.println(map2);
		System.out.println(map2.get(new SisInteger(1)));
		System.out.println(map2.get(new SisInteger(5)));
		
		
		
		
		
	}

}
