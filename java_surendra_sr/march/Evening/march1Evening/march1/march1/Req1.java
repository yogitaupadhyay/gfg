import java.util.ArrayList;
import java.util.HashSet;

public class Req1 {

	public static void main(String[] args) {
		Ball b1  = new Ball("red",40,210);
		Ball b2  = new Ball("red",40,220);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("b1=" + b1.hashCode());
		System.out.println("b2=" + b2.hashCode());
		
		System.out.println("b1.equals(b2) " + b1.equals(b2));

		ArrayList<Ball> list  = new ArrayList<Ball>();
		HashSet<Ball> set  = new HashSet<Ball>();
		
		list.add(b1);
		list.add(b2);
		
		set.add(b1);
		set.add(b2);
		
		System.out.println("list="+ list.size());
		System.out.println("set="+ set.size());
		
	}

}
