public class Tv{
	int volume;
	boolean ison;
	boolean isoff;
	String brandName;
	float price;
	void on(){
		System.out.println("tv on...");
	}
	void off(){
		System.out.println("tv off...");
		
	}
	
	void volumeUp(){
		System.out.println("tv voulume+..."+ ++volume+"vol");
		
	}
	void voulumeDown(){
		System.out.println("tv voulume+..."+ ++volume+"vol");
		
	}
	
}