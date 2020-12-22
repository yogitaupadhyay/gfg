import java.util.HashSet;

public class OneAttribute{
	public static void main(String args[]){
		Ball b1=new Ball(40,"red",250);
		Ball b2=new Ball(50,"red",250);
		Ball b3=new Ball(60,"red",250);
		Ball b4=new Ball(40,"black",250);
		Ball b5=new Ball(40,"red",250);
		
		HashSet<Ball>set=new HashSet<Ball>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		for(Ball data:set){
			System.out.println(data);
		}
		
	}
}