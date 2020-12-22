public class SisInteger implements Comparable<SisInteger>{
	
	private final int value;
	public SisInteger(int value){
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
		if(obj instanceof SisInteger){
			SisInteger s=(SisInteger)obj;
			if(s.value==value){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode(){
		return value*10;
	}
	
	@Override
	public int compareTo(SisInteger other) {
		if(this.value>other.value) {
			return -1;
		}else if(this.value<other.value) {
			return +1;
		}else {
			return 0;
		}
	}
	}