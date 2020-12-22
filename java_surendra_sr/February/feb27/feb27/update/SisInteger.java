
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

public class SisInteger {
	private final int value;

	public SisInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value+"";
		
	}
	  @Override
	  public boolean equals(Object obj) {
		  if(obj ==null)return false;
		  if(this==obj)return true;
		  if(obj instanceof SisInteger) {
			SisInteger  other =    (SisInteger) obj;
			if(this.value== other.value) {
				return true;
			}
		  }
		  
		  return false;
	  }
	
	
	@Override
	public int hashCode(){
	int logicNumber=value*7;
	
	return logicNumber;
	}
	
}
