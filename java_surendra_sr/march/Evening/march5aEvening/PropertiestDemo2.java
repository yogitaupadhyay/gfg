import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

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

public class PropertiestDemo2 {

 
	public static void main(String[] args) throws Exception {
		Properties pro  = new Properties();
		 System.out.println(pro);
		 pro.load(new FileReader("msg.properties"));
		 System.out.println(pro);
		 
		 Enumeration<String> ekeys = (Enumeration<String>) pro.propertyNames();
		 while(ekeys.hasMoreElements()) {
			 String key = ekeys.nextElement();
			 String value  = pro.getProperty(key);
			 System.out.println(key+ " = " +value);
		 }
		 

	}

}
