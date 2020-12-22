import java.io.File;

import javax.swing.JFileChooser;
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

public class GUITest {

 
	public static void main(String[] args) {
		String strID = JOptionPane.showInputDialog("enter id");
		long studentId  = Long.parseLong(strID);
		
		JFileChooser chooser = new JFileChooser();
		int returnCode = chooser.showOpenDialog(null);

		File selectedFile = null;
		if(JFileChooser.APPROVE_OPTION==returnCode) {
			 selectedFile = chooser.getSelectedFile();
			//todo 
		}else {
			System.out.println("user cancel operation");
			
		}
		
	}

}
