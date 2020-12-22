
public class SisInteger implements Comparable<SisInteger> {
	private final int value;

	public SisInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value+"";
		
	}
	  @Override
	  public boolean equals(Object obj) {
		  if(obj ==null)return false;
		  if(this==obj)return true;
		  if(obj instanceof SisInteger) {
			SisInteger  other =    (SisInteger) obj;
			if(this.value== other.value) {
				return true;
			}
		  }
		  
		  return false;
	  }
	
	@Override
	public int hashCode() {
		return value*7;
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
	  
	  
	  
}//class
