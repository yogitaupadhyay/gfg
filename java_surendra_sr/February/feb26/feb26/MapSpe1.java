
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

public class MapSpe1 {
 
	public static void main(String[] args) {
    
     HashMap <String,String> map=null; 
		map  = new HashMap <String,String>();
	 
		map.put("k1","value1");
		map.put("k4","value4");
		map.put("k3","value3");
		map.put("k2","value2");
		
		System.out.println(map);
		//{k1=value1, k2=value2, k3=value3, k4=value4}
		
		map.put("k2","value2222");//if key allread exist replace value
		System.out.println(map);
		//{k1=value1, k2=value2222, k3=value3, k4=value4}
		map.put("k999",null);
		System.out.println(map);
		//{k1=value1, k2=value2222, k3=value3, k4=value4, k999=null} 
	    map.put(null,"abc");
	    System.out.println(map);
	    //{null=abc, k1=value1, k2=value2222, k3=value3, k4=value4, k999=null}
	    System.out.println(map.get(null));//abc
		
		
	}

}
