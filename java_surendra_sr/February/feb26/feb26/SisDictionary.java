import java.util.Hashtable;
import java.util.Scanner;

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

public class SisDictionary {

 
	public static void main(String[] args) {
	 
	 Hashtable<String,String>dictionary = new Hashtable<String,String>();
	 
	 
	 dictionary.put("cpp", "c plus plus");
	 dictionary.put("j2se", "java 2 standard Edition");
	 dictionary.put("j2ee", " java 2 enterprice edition ");
	 dictionary.put("j2me", " java 2 Micro edition ");
	 dictionary.put("html", "hyper text markup lanaguage");
	 dictionary.put("sis", "Suredra it solution");
	 dictionary.put("java", "java is simple,pi,robust,distributed,secure,oop,portable,mutithread");
	 
	 
	 //show all
	 for(String word:dictionary.keySet()) {
		 System.out.println(word +" = " + dictionary.get(word));
	 }
	 
	 
	 
	 System.out.println("which word meaing you want");
	 String searchWord = new Scanner(System.in).nextLine();
	 boolean isFound = dictionary.containsKey(searchWord);
	 System.out.println(isFound?"found":"not found");
	 if(isFound) {
		 System.out.println(dictionary.get(searchWord));
	 }
	 
	 
	 
	 
	 
		
		
		
		
	}

}
