public class sisInteger {
	int value;
	sisInteger( int value){
		this.value=value;
		
	}
	@Override
	public String toString(){
		return String.valueOf(value);
		
	}
	@Override
	 public boolean equals(java.lang.Object obj){
		 if(obj==null){
			 return false;
			 
		 }
		 if(this==obj) return true;
		 if(obj instanceof sisInteger){
			sisInteger obj1=(sisInteger)obj ;//downcasted
			 if(this.value==obj1.value){
				 
				 return true;
			 } 
			
		 }
		 
		  return false;
	 }
}