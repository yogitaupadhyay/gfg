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

  //Date  16/10/2018
 public class Cow{ 
      String color;
      String name;
	  float weight;
	  int totalHorn;
	  
	final  static int MAX_HORN=2;
	         static int totalCow;
	  
	  Cow(){
	       totalCow++;
	       System.out.println(this  + " created....");
	  }
	  
	  Cow(String color,String name, float weight){
			this();
			 this.color=color;
			 this.name=name;
			 this.weight=weight;
	  }
	  
	  
	  
	  void eat(){
	    System.out.println(this+" "+ name +"  eating....");
	  }
	  
	    void walk(){
	    System.out.println(this+" "+ name +"  walking....");
	  }
	  
	  void aboutMyCowObject(){
	    System.out.println(" __________"+this +"_____________");
		System.out.println("name "  +name );
		System.out.println("color "  +color );
		System.out.println("weight "  +weight );
		System.out.println("totalHorn "  +totalHorn );
		System.out.println("______________________________");
	  }
	  
	static   void aboutCow(){
	   System.out.println("+++++++++++++what is cow?+++++");
	   System.out.println("Cow is Pet animal");
	   System.out.println("it has 4 legs, 2 eyes , 2 horn, 2 ears");
	   System.out.println("and 1 tail");
	   System.out.println("its gives milk....");
	   System.out.println("its has  color like white black....");
	  }
	
	
	
 }//End of class 
