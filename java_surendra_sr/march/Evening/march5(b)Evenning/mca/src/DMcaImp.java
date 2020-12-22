/*
NIT MCA
*/


 public class DMcaImp implements SisDevice{ 
 public void open(){
   //-----------on() C-------------
   System.out.println(this+"DMcaImp connected");
 }
 
 public void close(){
   System.out.println(this+"DMcaImp dis connected");
   //------------------------
 }
 }//End of class 
