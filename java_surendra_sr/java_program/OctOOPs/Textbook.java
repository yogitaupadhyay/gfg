public class Textbook{
	String name;
	String []pages;
	String authorName;
	int currentPage=1;
	boolean isOpen;
	float price;
	 void about(){
		 System.out.println("name = "+name);
		 System.out.println("authorName = "+authorName);
		 if(currentPage==0){
		 System.out.println("there is no page in book");
		 }else{
			 
		 System.out.println("currentPage = "+currentPage);
		 }
		 System.out.println("isOpen =  "+isOpen);
		 System.out.println("price = "+price);
		
	 }
	 
	 void show(){
		 System.out.println("pageNO:"+currentPage);
		 System.out.println(pages[currentPage-1]);
		 }
		 
		 void next(){
			 if(currentPage==pages.length){
			 System.out.println("already on last page");
				  }else{
			 currentPage=currentPage+1;
			 System.out.println("pageNO:"+currentPage);
			 System.out.println(pages[currentPage-1]);
			 }
		 }
		void  prev (){
			if(currentPage==1){
			System.out.println("already on page no 1");
			}else{
			currentPage=currentPage-1;
			 System.out.println("pageNO:"+currentPage);
			 System.out.println(pages[currentPage-1]);
			}
		}
		void first(){
			
			currentPage=1;
			 System.out.println("pageNO:"+currentPage);
			 System.out.println(pages[currentPage-1]);
			
		} 
		void  last(){
			currentPage=pages.length;
			
			 System.out.println("pageNO:"+currentPage);
			 System.out.println(pages[currentPage-1]);
		}
	
}