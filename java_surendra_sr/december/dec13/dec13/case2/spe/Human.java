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

  //Date  13/12/2018
 public class Human{ 

	private String name;
	private int age;
	private boolean fit;
	private float weight;
	
	public String getName(){
	//validation goes here
		return name;
	}

	
	public void setName(String name){
	   
	   if(name==null){
	      System.out.println("null name can not set");
		  return ;
	   }
	
	name =name.trim(); //"        " 
	
	   if(name.isEmpty()){
	      System.out.println(" name can not be empty");
		  return ;
	   }
	
	
	   if(name.length()<2 && name.length()>30){
	      System.out.println(" name length always b/w 3-30 char");
		  return ;
	   }
	//if all validation success then update
	
	
		this.name  = name;
	}


	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
			
		
	public float getWeight(){
		return weight;
	}
	public void setWeight(float weigth){
		this.weight = weight;
	}

		
	
	
	
	void giveDetailsAboutYou(){
	  System.out.println("+++++++++++++++++++++++++");
	 System.out.println( "name "+ name);
	 System.out.println("age "+age);
	 System.out.println("isFit "+fit);
	 System.out.println("weight "+weight);
	  System.out.println("+++++++++++++++++++++++++");
	 //System.out.println("weight "+this.weight);
	}
	

 }//End of class 
