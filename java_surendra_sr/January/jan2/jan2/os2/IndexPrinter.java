/*
@Author: Intex developer
*/
  //Date  02/01/2019
 public class IndexPrinter extends SisPrinter{ 
 
	public   void connect(){
	   System.out.println("Index Printer Conected***."+this);
	}
	public   void print(Object data){
	   System.out.println("Index Printer printing start.*****.");
	   String str  = data.toString();
	   for(int c=1;c<=str.length();c++){
		try{Thread.sleep(100);}catch(Exception e){}
		System.out.print(str.charAt(c-1));
	   }
	   System.out.println("Index Printer printing End.***...");
	
	}
	public   void disConnect(){
	   System.out.println("Index Printer dis-Conected.***.."+this);
	}
 
 
 }//End of class 
