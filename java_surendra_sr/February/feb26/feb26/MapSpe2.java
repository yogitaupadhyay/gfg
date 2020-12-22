
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

public class MapSpe2 {
 
	public static void main(String[] args) {
    //mobile email
     Hashtable <String,String> empContact=null; 
     empContact  = new Hashtable <String,String>();
	  
		empContact.put("9009442844","sur.nit.mca@gmail.com");
		empContact.put("1234567890",null);//NPE
		empContact.put(null,"test@gmail.com");//NPE
		
	}

}
