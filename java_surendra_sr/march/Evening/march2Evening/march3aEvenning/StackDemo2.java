import java.util.Stack;

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

public class StackDemo2 {

	public static void main(String[] args) {
		 
    Stack<Integer> stack  = new Stack<Integer>();
    stack.push(11);
    stack.push(22);
    stack.push(33);
    stack.push(44);
    System.out.println(stack);//[]
     for(int pos=stack.size();pos>=1;pos--) {
    	 System.out.println(stack.get(pos-1) +" ");
     }
	System.out.println("peek :  "+stack.peek());	
	System.out.println("search100 :  "+stack.search(100));	//-1
	System.out.println("search44 :  "+stack.search(44));//?1
	System.out.println("search11 :  "+stack.search(11));//?4
     
     
		
	}

}
