public class Trainer{
	void process(Form f)throws EmptyName, EmptyForm,
	InvalidNameException,NegativeAgeException,
	AgeRangeException{
		String name1=f.name.toLowerCase();
		if(f==null){
			throw new EmptyForm("empty form cannot be submitted");
		}
		if(name1==null||name1.trim().isEmpty()){
			throw new EmptyName("emptyNameException name cannot be submitted");
			
		}if(name1.length()<2&&name1.length()>50){
			throw new InvalidNameException("name length should in between 2-50");
			
		}
		
		
		for(int i=1;i<name1.length();i++){
			if(name1.charAt(i-1)<'a'&&name1.charAt(i-1)>'z'){
			throw new InvalidNameException("name cannot contain numbers");
				
			}
		}
		int age=f.age;
		if(age<0){
			throw new NegativeAgeException("negative age");
		}
		if(age<18&&age>50){
			throw new AgeRangeException("not in range");
		}
		
	}
}