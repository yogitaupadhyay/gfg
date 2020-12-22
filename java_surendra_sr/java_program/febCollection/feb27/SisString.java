public class SisString{
	
	private final String  value;
	public SisString(String  value){
		this.value=value;
		}
	@Override
	public String toString(){
		return ""+value;
	}
	@Override
	public boolean equals(Object obj){
		if(obj==null) return false;
		if(obj==this) return true;
		if(obj instanceof SisString){
			SisString s=(SisString)obj;
			if(s.value.equals(value)){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode(){
		
		int res=0;
		for(int i=0;i<value.length();i++){
			res=res+value.charAt(i);
		}
		return res;
	}
	
	}