
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

public final class SisTrainer {
	 private SisTrainer() {}
	
	public static void process(SisStudentForm form) 
			throws EmptyFormException,EmptyNameException
			,NameLengthEception,InvalideNameException,
			NegativeAgeExeption,AgeLimitException,
			EmailException{
		//validation 1
	 if(form==null) {
		 throw new EmptyFormException("Form can not null/empty");
	 }
	 //
	 String name  = form.getName();
	 if(name==null || name.trim().isEmpty()) {
		 throw new EmptyNameException("Name can not null/empty");
	 }
	 name = name.trim();//"    ab"  "a    "
	 //name length validation
	 int length  =name.length();
	 if((length>=3&&length<=30)==false) {
		 throw new NameLengthEception("Name length must be 3-30 char your name length "+length);
		 
	 }
	 //name must contain only  a-z
	 name = name.toLowerCase();
	 boolean isValidChar =true;
	 for(int e=1;e<=name.length();e++) {
		 char ch = name.charAt(e-1);  //A B
		 boolean c1  = ch>='a'&&ch<='z';
		 boolean c2  = ch==' ';
		 
		 if( (c1||c2 ) == false) {
			  isValidChar=false;
			  break;
		 }
	 }
	 
	 if(isValidChar==false) {
		 throw new InvalideNameException("Name must only contains a-z char ");
	 }
	 
	 //validation -ve age
	 
	 if(form.getAge()<0) {
		 throw new NegativeAgeExeption("age can not -ve input age:"+form.getAge());
		 
	 }
	  
	 
	 if((form.getAge()>=18 && form.getAge()<=50)==false) {
		 throw new AgeLimitException("age must be bw 18-50 years input age"+form.getAge());
		 
	 }
	 
	 String email  = form.getEmail();
	 if(email!=null) {
		 boolean isContains = email.contains("@");
		 if(isContains==false) {
			 throw new EmailException("Invalid email : email must be contain @ char input email: "+form.getEmail());
			 
		 }
	 }
	 
	 
	 
	 //if every thing is ok
	 //save form data into file or database
		
		 
		
	}
	
	
}
