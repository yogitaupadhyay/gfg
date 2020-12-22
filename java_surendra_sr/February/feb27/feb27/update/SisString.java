
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

public class SisString {
	private final String value;

	public SisString(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
@Override
	  public boolean equals(Object obj) {
		  if(obj ==null)return false;
		  if(this==obj)return true;
		  if(obj instanceof SisString) {
			SisString  other =    (SisString) obj;
			if(this.value.equals(other.value)) {
				return true;
			}
		  }
		  
		  return false;
	  }
	  
	  /*
   @Override
	public int hashCode(){
	int logicNumber=0;
	for(int c=1;c<=value.length();c++){
	   char ch  = value.charAt(c-1);
	   logicNumber = logicNumber + ch;
	}
	return logicNumber;
	}	  
	  */
	  
	public int hashCode(){
	return value.hashCode();
	}	
}
