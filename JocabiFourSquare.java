public class JocabiFourSquare{
	public static void main(String ags[]){
		System.out.println("eneter the no");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int sumOfDivisor=0;
		int sumOfOddDivisor=0;
		for(int i=1;i<Math.sqrt(n);i++){
			if(n%i==0){
				sumOfDivisor=sumOfDivisor+i;
				if(i%2!=0){
					sumOfOddDivisor=sumOfOddDivisor+i;
				}
			}
		}
		if(n%2==0){
			System.out.println(24*sumOfOddDivisor);
		}else{
			System.out.println(8*sumOfDivisor);
		}
		
	}
}