
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

public class Student {
	String name;
	StringBuffer notes =new StringBuffer();
	int totalNote;
	
	public Student(String name) {
		this.name=name;
	}
	
	public void speak() {
		think() ;
		System.out.println(name  +"  speak " +(int)(Math.random()*1000));
	}
	
	public void noteDown(String text) {
		think() ;
		notes.append(++totalNote+text+"\n");
	}
	
	public void showNotes() {
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(notes);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
	
   private void think() {
	     System.out.println(name +" is thinking.....");
		 try{Thread.sleep(2000);}catch(Exception e ){}
	     
   }

public String getName() { 
	return name;
}	
	
	
	
	

}
