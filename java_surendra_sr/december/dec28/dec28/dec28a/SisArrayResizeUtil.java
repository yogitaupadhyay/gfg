
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

public class SisArrayResizeUtil {

	public static String[] resize(String[] givenArray) {
		int totalElementFound=0;
		for (int e = 1; e <=givenArray.length; e++) {
			String data  = givenArray[e-1];
			if(data!=null) {
				totalElementFound++;
			}
		}
		
	   String [] tempArr  = new String[totalElementFound];
	   
	   for (int e = 1; e <=givenArray.length; e++) {
			String data  = givenArray[e-1];
			SisArrayFillUtil.fill(tempArr,data);
		}
	   
	   return tempArr;
		
	}

}
