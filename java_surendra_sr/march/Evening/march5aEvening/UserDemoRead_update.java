import java.io.FileOutputStream;
import java.io.FileReader;
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

public class UserDemoRead_update {

 
	public static void main(String[] args) throws Exception{
		Properties pro  = new Properties();
		pro.load(new FileReader("user.properties"));
		pro.setProperty("user_name", "surendra kumar sao");
		pro.setProperty("user_lang", "hindi engilish");
		pro.setProperty("sis", "success is sure");
		pro.store(new FileOutputStream("user.properties"),"test");

	}

}
