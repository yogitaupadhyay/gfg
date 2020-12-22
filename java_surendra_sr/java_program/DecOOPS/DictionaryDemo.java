public class DictionaryDemo{
	public static void main(String args[]){
		Dictionary dic=new Dictionary();
		java.util.Scanner scan= new java.util.Scanner(System.in);
		while(true){
			System.out.println("eneter ur choice");
			System.out.println("1:show dictionary");
			System.out.println("2: show favourite");
			System.out.println("3: search");
			System.out.println("4: make favourite");
			System.out.println("5: is favourite or not");
			System.out.println("6:exit");
			int choice=Integer.parseInt(scan.nextLine());
		
			switch(choice){
				case 1:     
				dic.showAll();
				break;
				
				case 2:     
				dic.showFavourite();
				break;
				
				case 3:
               System.out.println("enter ur word u want to search"); 	
               String word=scan.next();			   
              	
				int res=dic.search(word);
				dic.displayResult(res);
				
				break;
				
				case 4: 
				System.out.println("eneter urword u want to make favourite"); 
				 String word2=scan.next();		
           int res1=dic.search(word2);				
				dic. makeFavourite(res1);
				break;
				
				case 5:     
               System.out.println("eneter urword u want to check"); 
             String word1=scan.next();				   
				dic.isFavourite(word1);
				break;
				
				case 6:     
				System.exit(0);
			break;
				
				
				
			}
			
			
			
			
		}
		
	}
	
	
}