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

public class GuiDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int ans = JOptionPane.showConfirmDialog(null, "are you happy?");
		System.out.println(ans);
		//yes0 no1 cancel2   close-1
	   if(JOptionPane.OK_OPTION==ans) {
			 System.out.println("yes option");
		}else if(JOptionPane.CLOSED_OPTION==ans) {
			System.out.println("closed option");
			
		}else if(JOptionPane.CANCEL_OPTION==ans) {
			System.out.println("cancel option");
			
		}else if(JOptionPane.NO_OPTION==ans) {
			System.out.println("no  option");
		}else {
			System.out.println("other optiob  option");
			
		}
		
	}

}
