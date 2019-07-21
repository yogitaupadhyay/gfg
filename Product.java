public class Product{
	public static void main(String args[]){
		System.out.println("enter l,r,p");
		java.util.Scanner scan =new java.util.Scanner(System.in);
		Integer l=Integer.parseInt(scan.nextLine().trim());
		Integer r=Integer.parseInt(scan.nextLine().trim());
		Integer p=Integer.parseInt(scan.nextLine().trim());
		Integer res=0;
		for(int i=l;i<=r;i++){
			Integer iInt=i;
			String istr=iInt.toString();
			Integer pInt=p*i;
			String pstr=(pInt).toString();
			int count=0;
			for(int j=0;j<istr.length();j++){
				if(pstr.contains(istr.charAt(j)+"")==false){
					count++;
				}else{
					break;
				}
			}
			
			if(count==istr.length()){
				res++;
			}
		}
		System.out.println("res="+res);
		
		
	}
}