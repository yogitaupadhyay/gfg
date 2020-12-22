import java.util.HashSet;

public class MultiAttribute{
	public static void main(String args[]){
		SpeBall b1=new SpeBall(40,"red",250);
		SpeBall b2=new SpeBall(50,"red",250);
		SpeBall b3=new SpeBall(60,"red",250);
		SpeBall b4=new SpeBall(40,"black",250);
		SpeBall b5=new SpeBall(40,"red",250);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		System.out.println(b5.hashCode());
		HashSet<SpeBall>set=new HashSet<SpeBall>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		for(SpeBall data:set){
			System.out.println(data);
		}
		
	}
}                                                                                                     