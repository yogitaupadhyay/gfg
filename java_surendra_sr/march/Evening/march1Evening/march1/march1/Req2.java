import java.util.ArrayList;
import java.util.HashSet;

	public static void main(String[] args) {
		SpeBall b1  = new SpeBall("red",40,210);
		SpeBall b2  = new SpeBall("green",40,220);
		SpeBall b3  = new SpeBall("red",40,220);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("b1=" + b1.hashCode());
		System.out.println("b2=" + b2.hashCode());
		System.out.println("b3=" + b3.hashCode());
		
		System.out.println("b1.equals(b2) " + b1.equals(b2));//false
		System.out.println("b1.equals(b3) " + b1.equals(b3));//true

		ArrayList<SpeBall> list  = new ArrayList<SpeBall>();
		HashSet<SpeBall> set  = new HashSet<SpeBall>();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		System.out.println("list="+ list.size());
		System.out.println("set="+ set.size());
		
	}

}
