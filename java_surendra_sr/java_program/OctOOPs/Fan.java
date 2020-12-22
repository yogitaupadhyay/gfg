public class Fan extends  HouseHoldThings{
	int noOfBlades;
	void rotation(){
		System.out.println("Fan ids rotating");
		
	}
	Fan(){
		System.out.println("Fan object created");
	}
	static  {
	System.out.println("Fan static block is called");
		}
  {
	System.out.println("Fan non-static block is called");
		}
		
}