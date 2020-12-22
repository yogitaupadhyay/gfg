public class X{
	
	int div(int a,int b){
		return a/b;
	}
	int div1(int a,int b){
		if(b==0){
			throw  new ArithmeticException("eRROR:  heeleo divide by zero exception");		
			
			}
		return a/b;
	}
	int div2(int a,int b)throws ArithmeticException{
		if(b==0){
			throw  new ArithmeticException("eRROR:  divide by zero exception");		
			
			}
		return a/b;
	}
}