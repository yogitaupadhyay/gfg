
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
public class SpeDemo3Part1 {

	public static void main(String[] args) {
    
	Integer iObj1 = new Integer(100);	
	Integer iObj2 = new Integer(200);	
	Integer iObj3 = new Integer(100);	
   HashSet<Integer>data1 = new HashSet<Integer>();
   data1.add(iObj1);
   data1.add(iObj2);
   data1.add(iObj3);
    System.out.println(data1.toString());//[100, 200]
    System.out.println(data1.size());//2
	System.out.println("iObj1.hashCode()" + iObj1.hashCode());	
	System.out.println("iObj2.hashCode()" + iObj2.hashCode());	
	System.out.println("iObj3.hashCode()" + iObj3.hashCode());	
    
    
    
SisInteger sisiObj1 = new SisInteger(100);	
SisInteger sisiObj2 = new SisInteger(200);	
SisInteger sisiObj3 = new SisInteger(100);	

	HashSet<SisInteger>data2 = new HashSet<SisInteger>();
	data2.add(sisiObj1);
	data2.add(sisiObj2);
	data2.add(sisiObj3);
	System.out.println(data2.toString()); //
	System.out.println(data2.size());//3 AL
	System.out.println("sisiObj1.toString()" + sisiObj1.toString());	//100
	System.out.println("sisiObj2.toString()" + sisiObj2.toString());	//200
	System.out.println("sisiObj3.toString()" + sisiObj3.toString());	//100

	
	System.out.println("sisiObj1.equals(sisiObj2)" + sisiObj1.equals(sisiObj2) );//false	
	System.out.println("sisiObj1.equals(sisiObj3)" + sisiObj1.equals(sisiObj3) );//true	
	System.out.println("sisiObj1.hashCode()" + sisiObj1.hashCode());	//diff
	System.out.println("sisiObj2.hashCode()" + sisiObj2.hashCode());	//diff
	System.out.println("sisiObj3.hashCode()" + sisiObj3.hashCode());	//diff
    
	}

}
