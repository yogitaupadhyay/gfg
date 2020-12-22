
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

public class Trainer {
  String name;
  Student myStudent;
  public Trainer(String name) {
	  this.name=name;
  }
  
	public void setMyStudent(Student myStudent) {
		this.myStudent = myStudent;
	}  
  
  public void givesCommand() {
	  if(myStudent!=null) {
		  System.out.println("trainer " +name +" going to give command to " + myStudent.getName());
		  
			myStudent.speak();
			myStudent.speak();
			myStudent.noteDown("success is sure!");
			myStudent.noteDown("java is simple");
			myStudent.noteDown("be regular");
			myStudent.noteDown("be honest");
			myStudent.noteDown("be commited person");
			myStudent.showNotes();
		  
		  
		  
	  } else {
		  System.out.println("Trainer " + name  +" don't have any student to gives command...");
	  }
	  
  }
  
  
  
  
}
