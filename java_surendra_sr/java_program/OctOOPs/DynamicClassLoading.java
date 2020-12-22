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
			h.rotation();
		}
		if(h instanceof WaterBottle){
			h.fill();
			h.open();
		}
		if(h instanceof Bag){
			
			h.jipOpen();
		}
	
	}
	
	
	}
}