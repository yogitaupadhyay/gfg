
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
public class SpeDemo2 {

	public static void main(String[] args) {
    
	Integer iObj1 = new Integer(100);	
	Integer iObj2 = new Integer(200);	
	Integer iObj3 = new Integer(100);	
   ArrayList<Integer>data1 = new ArrayList<Integer>();
   data1.add(iObj1);
   data1.add(iObj2);
   data1.add(iObj3);
    System.out.println(data1.toString());//100,200,100 AL
    System.out.println(data1.size());//3
		
    
SisInteger sisiObj1 = new SisInteger(100);	
SisInteger sisiObj2 = new SisInteger(200);	
SisInteger sisiObj3 = new SisInteger(100);	

ArrayList<SisInteger>data2 = new ArrayList<SisInteger>();
	data2.add(sisiObj1);
	data2.add(sisiObj2);
	data2.add(sisiObj3);
	System.out.println(data2.toString()); //
	System.out.println(data2.size());//3 AL

	}

}
