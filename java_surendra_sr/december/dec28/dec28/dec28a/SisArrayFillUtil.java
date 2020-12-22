
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
 
   CurrentYear 2018 
 */

public class SisArrayFillUtil {

	public static void fill(String[] givenArray, String str) {
		if(givenArray!=null && str!=null) {
			for(int e=1;e<=givenArray.length;e++) {
				String data  =givenArray[e-1];
				if(data==null) {
					givenArray[e-1] = str;
					return;
				}
				
			}
			
		}
		
	}

}
