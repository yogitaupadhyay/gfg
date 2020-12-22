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
 */

  //Date  26/12/2018
 public class SisString{ 
 
 private final String value;
 
 public SisString(String value) {
        this.value = value;
  }

  @Override 
   public String toString(){
   return value;
   }
  
  /*
  @Override 
  public boolean equals(Object obj){
    if(obj==null) return false;
    if(this==obj) return true;
	//
     if(obj instanceof SisString){
	     SisString other  =(SisString) obj;
		  String s1  = this.value;
		  String s2 = other.value;
		  if(s1.length()!=s2.length()){return false;}
		  
	      boolean isOk=true;
		  for(int c=1;c<=s1.length();c++){
		     char ch1 = s1.charAt(c-1);
		     char ch2 = s2.charAt(c-1);
			 if(ch1!=ch2){ isOk=false;break;}
		  }//for
		  return isOk;
		  
	 }	//outer if
	
	return false;
}
  */
  
  
  
  
 
  @Override 
  public boolean equals(Object obj){
	if(obj==null) return false;
    if(this==obj) return true;
	//
     if(obj instanceof SisString){
	     SisString other  =(SisString) obj;
		  String s1  = this.value;
		  String s2 = other.value;
		  return s1.equals(s2);
		  
	 }	//outer if
	
	return false;
}


 }//End of class 
