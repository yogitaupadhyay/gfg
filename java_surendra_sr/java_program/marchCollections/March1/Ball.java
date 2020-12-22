public class Ball{
	float price;
	String color;
	float weight;
	Ball(float price,String color,float weight){
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
		if(obj instanceof Ball){
			Ball b=(Ball)obj;
			if(b.price==this.price){
				return true;
			}
			
}
return false;
	}
	@Override
	public  int hashCode(){
		return (int	)price;
	}
}//end of class