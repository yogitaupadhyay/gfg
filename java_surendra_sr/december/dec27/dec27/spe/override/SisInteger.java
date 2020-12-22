 
 public class SisInteger{ 
 
	private final int value;
 
	public SisInteger(int value){ 
		this.value=value;
	 }
   
 
  @Override 
   public String toString(){
   //return value +""
   return String.valueOf(value);
   }
   
  @Override 
  public boolean equals(Object obj){
    if(obj==null) return false;
    if(this==obj) return true;
	//
     if(obj instanceof SisInteger){
	     SisInteger other  =(SisInteger) obj;
	     if(this.value==other.value){
		 return true;
		 }//inner if
		 
	 }	//outer if
	
	return false;
}
  
 }//End of class 
