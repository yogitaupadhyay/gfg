public class X{
	
		int m1(int a,int b){
			return a/b;
		}

		
		int m2(int a,int b){
			if(b==0){
			throw new ArithmeticException("divide by zero exception");
			}else{
				return a/b;
			}
		}
	
}