public class FormProcessing{
	public static  void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		Form f=new Form();
		Trainer trainer=new Trainer();
		System.out.println("enter ur name");
	f.name=scan.nextLine();
	
		System.out.println("enter ur age");
		 f.age=Integer.parseInt(scan.nextLine());
		 
		 
		System.out.println("enter ur fathers name");
	f.FathersName=scan.nextLine();
	
	
		System.out.println("enter ur gender");
	 f.gender=scan.nextLine();
	 
	 
		System.out.println("enter ur mobile no");
	f.mobileno=scan.nextLine();
	
	
		System.out.println("enter ur email");
	  f.email=scan.nextLine();
		try{
        trainer.process(f);
		f.showDetail();
		}catch(EmptyForm e){
			System.out.println(" form cannot be empty");
			System.out.println("msg = "+e.getMessage());
		}catch(EmptyName  e){
			System.out.println("name is empty");
			System.out.println("msg = "+e.getMessage());
		}catch(InvalidNameException e){
			System.out.println("in valid name");
			System.out.println("msg = "+e.getMessage());
		}catch(NegativeAgeException e ){
			System.out.println("age cannot be negative");
			System.out.println("msg = "+e.getMessage());
			
		}catch(AgeRangeException e){
		
			System.out.println("age range is 18 -50");
			System.out.println("msg = "+e.getMessage());
	}
}}