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
    public  int div1(int a, int b){
	  return a/b;
	}

	public  int div2(int a, int b){
	    if(b==0){
			String msg  = "b must not ZERO cause infinite / by zero";
			throw new ArithmeticException(msg);
		}
	   
	  return a/b;
	}
	
	
	public  int div3(int a, int b) throws ArithmeticException{
	    if(b==0){
			String msg  = "b must not ZERO cause infinite / by zero";
			throw new ArithmeticException(msg);
		}
	   
	  return a/b;
	}
 }//End of class 
