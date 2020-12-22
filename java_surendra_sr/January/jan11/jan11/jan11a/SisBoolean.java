
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

public final class SisBoolean {
	public static boolean parseBoolean(String value)
		throws InvalidBooleanValueException{
		
		 
		if(value==null || value.trim().isEmpty()) {
			String msg  = "Invalid Value :value must be true/false Or Yes/No O ha/Na : input value is " +value;
			InvalidBooleanValueException e = null;
			e = new InvalidBooleanValueException(msg);
			throw e;
		}
		
		boolean c1= "yes".equalsIgnoreCase(value);
		boolean c2= "no".equalsIgnoreCase(value);
		boolean c3= "true".equalsIgnoreCase(value);
		boolean c4= "false".equalsIgnoreCase(value);
		boolean c5= "ha".equalsIgnoreCase(value);
		boolean c6= "na".equalsIgnoreCase(value);
		
		//ok value
		boolean okValue  = c1||c2||c3||c4||c5||c6;
		if(okValue==false) {
			String msg  = "Invalid Value :value must be true/false Or Yes/No O ha/Na : wrong input value is " +value;
			InvalidBooleanValueException e = null;
			e = new InvalidBooleanValueException(msg);
			throw e;
		}
		
		//if code reach here it mean what? value valid
		
		if(value.equalsIgnoreCase("yes")||value.equalsIgnoreCase("true")||value.equalsIgnoreCase("ha")) {
			return true;
		}else {
			return false;
		}
		
				
	}

}
