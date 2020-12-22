public class WaterBottle extends  HouseHoldThings{
	double  capacity;
	void fill(){
		System.out.println("WaterBottle is filled");
		
	}
	void open(){
		
		System.out.println("WaterBottle is opened");
	}
	WaterBottle(){
		System.out.println("WaterBottle object created");
	}
	static  {
	System.out.println("WaterBottle static block is called");
		}
  {
	System.out.println("WaterBottle non-static block is called");
		}
		
}