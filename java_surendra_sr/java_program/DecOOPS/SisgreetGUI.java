public class SisgreetGUI extends Sisgreet{

	void show(){
	String msg="hello! today id "+new java.util.Date();
		msg =msg+"welcome "+System.getenv("username");
		javax.swing.JOptionPane.showMessageDialog(null,msg);
		
	}

}