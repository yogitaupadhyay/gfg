import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

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
 
   CurrentYear 2018 
 */

public class GuiTEst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame  = new JFrame("Sis Greet");
		JTextArea textArea  = new JTextArea();
		textArea.setText("Happy Programming by Sis");
		JLabel lable  = new JLabel("happy programming");
		
		frame.getContentPane().add(lable);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
