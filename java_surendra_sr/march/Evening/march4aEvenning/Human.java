
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

public class Human {
	 String name;
	 Human friend;
	 public Human(String name ) {
		 this.name=name;
	 }
	 
	
    void aboutMe(){
    	 StringBuilder sb  = new StringBuilder();
    	 sb.append("my name is "+ name);
    	 if(friend!=null) {
    		sb.append(" and my friend name is " + friend.name);
    	 }else {
    		 sb.append(" I don't have friend ");
    	 }
    	 System.out.println(sb.toString());
    }
}
