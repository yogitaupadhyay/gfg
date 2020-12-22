import java.util.Properties;

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

public class PropertiestDemo {

 
	public static void main(String[] args) {
		Properties pro  = new Properties();
		System.out.println(pro);
		pro.setProperty("key1", "value1");
		pro.setProperty("key2", "value2");
		pro.setProperty("key3", "value3");
		pro.setProperty("key4", "value4");
		pro.setProperty("key5", "value5");
		System.out.println(pro);
		System.out.println(pro.getProperty("key1"));
		System.out.println(pro.getProperty("key111"));

	}

}
