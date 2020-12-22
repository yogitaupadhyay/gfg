
public class SpeBall{
	float price;
	String color;
	float weight;
	SpeBall(float price,String color,float weight){
		this.price=price;
	this.color=color;
	this.weight=weight;
	}
	@Override
	public String toString(){
		return "price"+price+"color"+color+"weight"+weight;
		
	}
	@Override
	public boolean equals(Object obj){
		
		if(obj==null) return false;
		if(this==obj) return true;
		if(obj instanceof SpeBall){
			SpeBall b=(SpeBall)obj;
			if(b.price==this.price&&this.color.equals(b.color)){
				return true;
			}
			
}
return false;
	}
	@Override
	public  int hashCode(){
		return (int	)price*color.hashCode();
	}
}//end of class