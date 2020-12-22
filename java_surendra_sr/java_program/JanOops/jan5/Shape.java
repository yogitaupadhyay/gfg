abstract public  class shape{
	String bg;
	String borderColor;
	void show(){
		System.out.println(this+"bg="+bg);
		System.out.println(this+"borderColor="+borderColor);
		System.out.println(this+"area="+getArea);
		
		
	}
	void setbg(double bg){
	this.bg=bg;
	}
	 abstract double getArea();
}