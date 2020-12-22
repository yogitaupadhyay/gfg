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

  //Date  10/01/2019
 public class X{ 
 
  public void  m1(int num){
    if(num==6){
	  throw new MyException1("number must not be 6  NOT applicable");
	}
	System.out.println("OK happy input " + num);
      
  }
 

  public void  m2(int num) throws  MyException1{
    if(num==6){
	  throw new MyException1("number must not be 6  NOT applicable");
	}
	System.out.println("OK happy input " + num);
      
  }

 
 public void  m3(int num) throws  MyException2{
    if(num==6){
	MyException2   e =   new MyException2("number must not be 6  NOT applicable");
		throw e;
		/*try{
		throw e;
		}catch(MyException2 e){
		}*/
	}
	System.out.println("OK happy input " + num);
      
  }
 
 
 }//End of class 
