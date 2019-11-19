package sis.com;

public class SmallestWindow {
	public static String Window(String str,String pattern){
	int []hash_str=new int[256];
	int[] hash_pat=new int[256];
		
		for(int i=0;i<pattern.length();i++){
		hash_pat[pattern.charAt(i)]++;
	}
	
		int count=0;int start =0;int min_length=Integer.MAX_VALUE;int start_index=-1;
		for(int i=0;i<str.length();i++){
			hash_str[str.charAt(i)]++;
			if(hash_pat[str.charAt(i)]!=0
					&&hash_str[str.charAt(i)]<=hash_pat[str.charAt(i)])
			{
				count++;
				
				
			}
			if(count==pattern.length()){
				while(hash_str[str.charAt(start)]>hash_pat[str.charAt(start)]
						||hash_pat[str.charAt(start)]==0){
					if(hash_str[str.charAt(start)]>hash_pat[str.charAt(start)]){
						hash_str[str.charAt(start)]--;
						start++;
					}
				}
				int len1=i-start+1;
				
				if(min_length>len1){
					min_length=len1;
					start_index=start;
				}
			}
			
		}
		System.out.println(min_length);
		return str.substring(start_index,start_index+min_length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="timetopractoce";
		str=str+str;
		String pattern="toc";
		System.out.println(Window(str,pattern));

	}

}
