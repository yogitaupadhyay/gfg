
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
import java.util.*;
public class SpeDemo1 {

	public static void main(String[] args) {
    
	Integer iObj1 = new Integer(100);	
	Integer iObj2 = new Integer(200);	
	Integer iObj3 = new Integer(100);	
		
	System.out.println("_____________list__________________");
   ArrayList<Integer>data1 = new ArrayList<Integer>();
   data1.add(iObj1);
   data1.add(iObj2);
   data1.add(iObj3);
   System.out.println(data1.size());
   System.out.println(data1.toString());
   
   System.out.println("__________set_____________________");
   
   HashSet<Integer>data2 = new HashSet<Integer>();
   data2.add(iObj1);
   data2.add(iObj2);
   data2.add(iObj3);
   
   System.out.println(data2.size());
   System.out.println(data2.toString());
   
   System.out.println("____________list___________________");
   ArrayList<String>data3 = new ArrayList<String>();
	data3.add(new String("java"));
	data3.add(new String("cpp"));
	data3.add(new String("java"));
	System.out.println(data3.size());
	System.out.println(data3.toString());
	
	System.out.println("____________list___________________");
	HashSet<String>data4 = new HashSet<String>();
		data4.add(new String("java"));
		data4.add(new String("cpp"));
		data4.add(new String("java"));
		System.out.println(data4.size());
		System.out.println(data4.toString());
		
	}

}
