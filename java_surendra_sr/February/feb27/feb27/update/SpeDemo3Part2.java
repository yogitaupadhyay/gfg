
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
    System.out.println("s1.equals(s2)" + s1.equals(s2)) ;//false
    System.out.println("s1.equals(s3)" + s1.equals(s3)) ;//true
	
    System.out.println("s1.hashCode()" + s1.hashCode()) ;
    System.out.println("s2.hashCode()" + s2.hashCode()) ;
    System.out.println("s3.hashCode()" + s3.hashCode()) ;
		System.out.println("+++++++++++++++++++++++++++++++++");
     
    SisString sisS1 = new SisString("java");	
    SisString sisS2 = new SisString("success");	
    SisString sisS3 = new SisString("java");	
   HashSet<SisString>data2 = new HashSet<SisString>();
   data2.add(sisS1);
   data2.add(sisS2);
   data2.add(sisS3);
    System.out.println(data2.toString());//[java, success] 
    System.out.println(data2.size());//3
		
		System.out.println("sisS1.equals(sisS2)" + sisS1.equals(sisS2)) ;//false
    System.out.println("sisS1.equals(sisS3)" + sisS1.equals(sisS3)) ;//false
        System.out.println("sisS1.hashCode()" + sisS1.hashCode()) ;//dif
    System.out.println("sisS2.hashCode()" + sisS2.hashCode()) ;//dif
    System.out.println("sisS3.hashCode()" + sisS3.hashCode()) ;//dif
    

	}

}
