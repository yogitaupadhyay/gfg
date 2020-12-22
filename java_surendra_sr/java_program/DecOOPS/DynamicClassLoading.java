public class DynamicClassLoading{
	public static void main(String args[])throws Exception{
	Bag b=new Bag();
	System.out.println("enter the type u want to create");
	java.util.Scanner scan=new java.util.Scanner(System.in);
	String type=scan.nextLine();
	Class c=Class.forName(type);
	Object obj=c.newInstance();
	System.out.println(obj);
	if(obj instanceof HouseHoldThings){
		HouseHoldThings h=(HouseHoldThings)obj;
		h.price=400f;
	    h.color="red";
		if(h instanceof Fan){
			Fan f=(Fan)h;
			f.rotation();
		}
		if( h instanceof WaterBottle){
			WaterBottle w=(WaterBottle)h;
			w.fill();
			w.open();
		}
		if( h instanceof Bag){
			Bag b1=(Bag)h;
			b1.jipOpen();
		}
	
	}
	
	
	}
}