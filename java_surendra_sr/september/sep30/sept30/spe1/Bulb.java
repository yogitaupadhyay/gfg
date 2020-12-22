public class Bulb{
   String brandName;
   float price;
   String lightColor;
   boolean isOn;
   int walt;
  

    void on(){
	  System.out.println("bulb on");
		isOn= true;
	}
	
    void off(){
	  System.out.println("bulb Off");
		isOn= false;
	}
  
}