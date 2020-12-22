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

  //Date  30/09/2018
 public class Human{ 
 
    String name;
	String gender;
	//age in month
	int age;
	boolean fit;
	float weight;
	
	void giveDetails(){
	System.out.println("______________________________________");
	 System.out.println("my name is  " + name);
	 System.out.println("gender is  " + gender);
	 System.out.println("i m " + (age/12) +"year and " +(age%12)+ "  month old");
	 System.out.println(" i m " + (fit==true?" Fit " :" NOt Fit "));
	 System.out.println("and finally my weight : "+ weight);
	System.out.println("______________________________________");
	}
	
	
	void eat(){
	  System.out.println(name  + " eating....");
	}
	
	
	void speak(String text){
	  System.out.println(name  + " speaking......" + text);
	}
	
    double giveOneNumber(){
	   double num  = Math.random()*1000;
	 return num;
	}
	
	String converIntoWord(int givenNumber){
	 String word="";
	   switch(givenNumber){
	      case 0 :  word="zero";break;
	      case 1 :  word="one";break;
	      case  2:  word="two";break;
	      case  3:  word="three";break;
	      case  4:  word="four";break;
	      case  5:  word="five";break;
		  default : word="do yourself";
	   }
	
	
	return word;
	}
	
	
	
	
	
 
 // todo
 }//End of class 
