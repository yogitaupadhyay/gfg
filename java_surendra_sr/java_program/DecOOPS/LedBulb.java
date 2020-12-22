public class LedBulb {
	boolean isOn;
	
	String color={"RED","GREEN"};
	void on(!isOn){
		System.out.println(color[0]+" bulb is on");
		System.out.println(color[1]+" bulb is on");
		isOn=true;
	}
	void off(){
		
		System.out.println(color[0]+" bulb is off");	
		System.out.println(color[1]+" bulb is off");	
	isOn=false;
}