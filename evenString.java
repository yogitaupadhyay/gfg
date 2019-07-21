public class evenString{
	public static void main(String args[]){
		System.out.println("enter your string");
	java.util.Scanner scan=new java.util.Scanner(System.in);
	String str=scan.nextLine();
	System.out.println(str);
	int init=0;
	int max=0;
	while(init>=0){
		int indexSpace=str.indexOf(" ",init+1);
		int res=indexSpace-init-1;
		if(res==0){res=1;}
		if(indexSpace==-1){
			res=str.length()-init-1;
		}
		init=indexSpace;
		if(res%2==0&&res>max){
			max=res;
		}
		System.out.println("res="+res);
		
	}
	
	System.out.println("max="+max);
	
	
	
	}
}
