	

  //Date  01/10/2018
 public class TextBook{ 
     String name;//null
	 float price;//0.0
	 String authorName;//null
	 int currentIndexPage;//0
	 String [] pages;//null
	 boolean isOpen;//false
	 
	 void about(){
	    System.out.println("__________Details_____________");
		System.out.println("name  " + name);
		System.out.println("price  " + price);
		System.out.println("authorName  " + authorName);
		if(pages!=null){
		System.out.println(" total pages  " + pages.length);
		}else{
		System.out.println(" total pages  : no pages added" );
		}
		System.out.println("______________________");
	 }
	
	 void show(){
	 int pageNum= currentIndexPage+1;
	   System.out.println("++++++++page"+pageNum+"++++++++++++");
	   String data =  pages[currentIndexPage];
	    System.out.println(data);
	   System.out.println("++++++++++++++++++++");
	 }
	 
	 
	 void first(){
	    currentIndexPage =0;
		show();
	 }
	 void last(){
	 currentIndexPage = pages.length-1;
	 show();
	 }
	 
	 
	 void next(){
	    if(currentIndexPage==(pages.length)){
		   System.out.println("its in last page");
		   return ;
		}
		
		show();
		currentIndexPage = currentIndexPage + 1;
	 }
	 void prev(){
	 
	   if(currentIndexPage==0){
	      System.out.println("page is in first page");
		  return;
	   }
	   
	   currentIndexPage = currentIndexPage - 1;
	   show();
	 
	 }
	 
	 
	void jumpPage(int pageNo){
	   if(pageNo>=1 && pageNo<=pages.length){
	       currentIndexPage = pageNo-1;
		   show();
	   }else{
	     System.out.println("invalid page " + pageNo);
	   }
	
	}
	 
	 
	int getTotalPage(){
	 return pages.length;
	} 
	 
 }//End of class 
