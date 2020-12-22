public class Dictionary{
	String [][] dictionary=new String[60][3];
	
	java.util.Scanner scan=new java.util.Scanner(System.in);
	//constructor
	Dictionary(){
		
{
		 dictionary[0][0]="keyword";
	     dictionary[0][1]="details";
	     dictionary[0][2]="favourite";
		 
		 dictionary[1][0]="hailing";
	     dictionary[1][1]="falling something";
	     dictionary[1][2]="";
		 
		 dictionary[2][0]="hacked off";
	     dictionary[2][1]="cut off";
	     dictionary[2][2]="";
		 
		 dictionary[3][0]="citadel";
	     dictionary[3][1]="fortress";
	     dictionary[3][2]="";
		 
		 dictionary[4][0]="clout";
	     dictionary[4][1]="influence or power";
	     dictionary[4][2]="";
		 
		 dictionary[5][0]="detriment";
	     dictionary[5][1]="harm";
	     dictionary[5][2]="";
		 
		 dictionary[6][0]="goof up";
	     dictionary[6][1]="a stupid mistake";
	     dictionary[6][2]="";
		 
		 dictionary[7][0]="tainted";
	     dictionary[7][1]="contaminated or pollute";
	     dictionary[7][2]="";
		 
		 dictionary[8][0]="albeit";
	     dictionary[8][1]="alhtough";
	     dictionary[8][2]="";
		 
		 dictionary[9][0]="fray";
	     dictionary[9][1]="unravel";
	     dictionary[9][2]="";
		 
		 dictionary[10][0]="flanking ";
	     dictionary[10][1]="to be placed at side";
	     dictionary[10][2]="";
		 
		 dictionary[11][0]="creed";
	     dictionary[11][1]=" a faith";
	     dictionary[12][2]="";
	
	
	}

	}
	
	//show all function
 void showAll(){
	          System.out.printf("%-20s","keywords");
         System.out.printf("%-35s","details");
         System.out.printf(" %-10s ","favourite"  );
     
      System.out.println("--------------------------------------------------------------------------" );
	 
      for(int i=1;i<=dictionary.length;i++){
		  if(dictionary[i][0]==null){
			  break;
		  }
         System.out.printf("%-20s",dictionary[i][0] );
         System.out.printf("%-35s ",dictionary[i][1]);
         System.out.printf(" %-10s ",dictionary[i][2]);
         System.out.println();

        
	  }
	          System.out.println();
         System.out.println();
   }
 
 
 // search
 int search( String word){
	 int i;
	 for(i=1;i<=dictionary.length;i++){
		if(dictionary[i][0]==null){
			  break;
		  }else if(dictionary[i][0].equalsIgnoreCase(word)){
			 break;
			 
		 }
 }
 return i;

 
	 
 }
 // display after search
 void displayResult( int i){
	 int count=0;
	 for(int j=0;j<=dictionary.length;j++){
		  count++;
		 if(dictionary[j][0]==null){
			
			 break;
		 }
 }
	 if(i<=dictionary.length&& dictionary[i][0]!=null){
		  System.out.println("keywords"+"  "+"details"+"  "+"favourite" );
		  System.out.println("------------------------------------------" );
		  System.out.println( );
	     System.out.println(dictionary[i][0] +"  "+dictionary[i][1]+"  "+dictionary[i][2] );
		  System.out.println( );
		  System.out.println("------------------------------------------" );
                
				
				System.out.println("would you like to make dis your favourite");
				String res1=scan.next();
				if(res1.equalsIgnoreCase("yes")){
					this.makeFavourite(i);
					
				}else{
                System.out.println("thanku for your visit");
					
				}
		 
        }else if(count<dictionary.length){
                System.out.println("word not found would you like to add it to the dictionary");
				
                String  res=scan.next();
                if(res.equalsIgnoreCase("yes")){
					System.out.println("enter your words");
					dictionary[count-1][0]=scan.nextLine();
					System.out.println("enter your details");
					dictionary[count-1][1]=scan.nextLine();
	
                }
            }else{
               System.out.println("word not found ");	
            }
	 
 }
 // is favourite
 
 void isFavourite(String word){
	  int r=this.search( word);
	  if(dictionary[r][2].equals("*")==true){
		  
               System.out.println("yes this word is your favourite");	
		   }
	 }
	 
	 
	 // show favourite
	 
	  void showFavourite(){
		  System.out.println("keywords"+"  "+"details"+"  "+"favourite" );
		  System.out.println("------------------------------------------" );
		  System.out.println( );
	 
      for(int i=1;i<=dictionary.length;i++){
		  if(dictionary[i][0]==null){
			  break;
		  }else if(dictionary[i][2]==null){
			  
			 
		  } else if(dictionary[i][2].equals("*")==true&&dictionary[i][2]!=null){
			  
         System.out.println(dictionary[i][0] +"  "+dictionary[i][1]+"  "+dictionary[i][2] );
		  }
        }
		System.out.println( );
		  System.out.println("------------------------------------------" );
		  
	  }
	  
	  //make favourite method
	  void makeFavourite(int a){
		  dictionary[a][2]="*";
		  
	  }
	
	
	
	
}