public class Req4{
public static void main(String args[]){
	String []wordList={"hi","hello","dear","sis",null,
	"happy programming"		
	};
	try{
	for(int j=1;j<wordList.length;j++){
		System.out.println(wordList[j-1].toUpperCase());
	}}catch(NullPointerException e){
		System.out.println("there is no word ");
	}
}
}