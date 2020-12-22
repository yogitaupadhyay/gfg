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

public class StackDemo1 {

	public static void main(String[] args) {
		 
    Stack<Integer> stack  = new Stack<Integer>();
    System.out.println(stack);
    //[]
    stack.push(11);
    System.out.println(stack);
    //[11]
    stack.push(22);
    System.out.println(stack);
    //[11, 22]
    
    stack.push(33);
    System.out.println(stack);
    //[11, 22, 33]                   //33 22 11
    
    System.out.println("pop" + stack.pop());
    System.out.println(stack);//[11, 22]
		
    System.out.println("pop" + stack.pop());
    System.out.println(stack);//[11,]
    
    System.out.println("pop" + stack.pop());
    System.out.println(stack);//[]
    System.out.println("pop" + stack.pop());
    //java.util.EmptyStackException
    System.out.println(stack);//[]
    //
		
		
	}

}
