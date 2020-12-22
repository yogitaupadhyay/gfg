public class sisString {
	String value;
	sisString( String value){
		this.value=value;
		
	}
	@Override
	public String toString(){
		return value;
		
	}
	@Override
	public boolean equals(java.lang.Object obj){
		 if(obj==null){
			 return false;
			 
		 }
		 if(this==obj) return true;
		 if(obj instanceof sisString){
			sisString obj1=(sisString)obj ;//downcasted
			 if(this.value.equals(obj1.value)){
				 
				 return true;
			 } 
			
		 }
		 
		  return false;
	 }
}