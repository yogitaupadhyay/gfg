
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
public class SpeDemo3Part2 {

	public static void main(String[] args) {
    
	String s1 = new String("java");	
	String s2 = new String("success");	
	String s3 = new String("java");	
   HashSet<String>data1 = new HashSet<String>();
   data1.add(s1);
   data1.add(s2);
   data1.add(s3);
    System.out.println(data1.toString());//[java, success] 
    System.out.println(data1.size());//2
		
     
    SisString sisS1 = new SisString("java");	
    SisString sisS2 = new SisString("success");	
    SisString sisS3 = new SisString("java");	
   HashSet<SisString>data2 = new HashSet<SisString>();
   data2.add(sisS1);
   data2.add(sisS2);
   data2.add(sisS3);
    System.out.println(data2.toString());//[java, success] 
    System.out.println(data2.size());//2
		
    
    

	}

}
