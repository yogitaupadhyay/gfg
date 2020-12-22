
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

public class MapDemo3 {
 
	public static void main(String[] args) {
    
		HashMap <Integer,String> studentMap=null; 
		studentMap  = new HashMap <Integer,String>();
		
		System.out.println(studentMap.size());
		System.out.println(studentMap.isEmpty());
		
		studentMap.put(103, "deepak");
		studentMap.put(101, "ravi");
		studentMap.put(105, "vivek");
		studentMap.put(104, "pratik");
		studentMap.put(102, "meena");
 
		System.out.println("studentMap"+studentMap);
		 		
  		Set<Integer> studentIdsSet = studentMap.keySet();
		System.out.println(studentIdsSet.getClass());
		 
		for(Integer id : studentMap.keySet()) {
			String studentName = studentMap.get(id);
			 System.out.println("id# "+ id  +" = " + studentName);
		}
		
		
		
		
		
		
		
		
	}

}
