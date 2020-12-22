
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

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer iobj1  = new Integer(100);
		Integer iobj2  = new Integer(200);
		Integer iobj3  = new Integer(100);
		System.out.println("iobj1.toString()" + iobj1);
		System.out.println("iobj2.toString()" + iobj2);
		System.out.println("iobj3.toString()" + iobj3);
		
		System.out.println(iobj1==iobj2);//false
		System.out.println(iobj1==iobj3);//false
		System.out.println(iobj1.equals(iobj2));//false
		System.out.println(iobj1.equals(iobj3));//true
		
		System.out.println("++++++++++++++++++++++++++");
		
		SisInteger sisObj1  = new SisInteger(100);
		SisInteger sisObj2  = new SisInteger(200);
		SisInteger sisObj3  = new SisInteger(100);
		System.out.println("sisObj1.toString()" + sisObj1);
		System.out.println("sisObj2.toString()" + sisObj2);
		System.out.println("sisObj2.toString()" + sisObj3);
		
		System.out.println(sisObj1==sisObj2);//false
		System.out.println(sisObj1==sisObj3);//false
		System.out.println(sisObj1.equals(sisObj2));//false
		System.out.println(sisObj1.equals(sisObj3));//false if not
		//equals method override 
		
	}

}
