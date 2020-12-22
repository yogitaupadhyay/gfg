
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

public class SisStart {

	 
	public static void main(String[] args) throws Exception{
		if(args.length<1){
		  System.out.println("Pass Greet type ");
		  System.exit(0);
		}
		 
		Class c= Class.forName(args[0]);
		Object obj  = c.newInstance();
		
		if(obj instanceof SisGreet){
			SisGreet sg  =(SisGreet)obj;//
			sg.showGreeting();
		}else{
		  System.out.println("its not SisGreet object");
		}
		

	}

}
