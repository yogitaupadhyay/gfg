public class Calculator extends Software{
int fontSize;
String [] typesofCalculator={"standard","programmable","scientific"};
Calculator( String title,float height,float width ,int fontSize){
	
	super(title, height, width );
	this.fontSize=fontSize;
}

	
}