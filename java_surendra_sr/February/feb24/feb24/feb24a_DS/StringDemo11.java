import java.util.Arrays;
import java.util.StringTokenizer;

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

public class StringDemo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* String str ="java:is@simple:sis@nit";
		 String[] split = str.split(": @");
		 System.out.println(split.length);
		 System.out.println(Arrays.toString(split));
		 
		StringTokenizer st = new StringTokenizer(str, ":@");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}*/
		
		String str="don't do it ";
		StringTokenizer st = new StringTokenizer(str, " '");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}		
		
		
		
		 
		 
		 
	}

}
