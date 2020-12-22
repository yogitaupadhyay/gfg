import javax.swing.JOptionPane;

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

public class GuiDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("welcome to sis");
		int num1;
		int num2;
		
		String str1 = JOptionPane.showInputDialog(null,"Enter first number");
		String str2 = JOptionPane.showInputDialog(null,"Enter second number");

		num1  = Integer.parseInt(str1);
		num2  = Integer.parseInt(str2);
		
		int sum = num1 + num2;
		String message =num1 +" + " + num2 +" = " + sum;
		JOptionPane.showMessageDialog(null, message);
		
		
		
		
	}

}
