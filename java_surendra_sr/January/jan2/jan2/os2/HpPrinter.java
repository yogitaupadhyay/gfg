/*
@Author:hpdeveloper
*/
  //Date  02/01/2019
 public class HpPrinter extends SisPrinter{ 
 
	public   void connect(){
	   System.out.println("HP Printer Conected......."+this);
	}
	public   void print(Object data){
	   System.out.println("HP Printer printing start.......");
	   System.out.println(data.toString());
	   System.out.println("HP Printer printing End.......");
	
	}
	public   void disConnect(){
	   System.out.println("HP Printer dis-Conected......."+this);
	}
 
 
 }//End of class 
