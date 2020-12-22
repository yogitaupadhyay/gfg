public final class  Stu_Util{
	public  static void showAll(Student stulist[]){
		System.out.printf("%4s","id");
		System.out.printf("%20s","name");
		System.out.printf("%4s ","age");
		System.out.printf("%15s","heigth");
		System.out.printf("%15s","weight");
		System.out.println();
		for(Student data:stulist){
			if(data!=null){
			System.out.printf("%4d",data.getId());
			System.out.printf("%20s",data.getName());
			System.out.printf("%4d",data.getAge());
			System.out.printf("%15f",data.getHeight());
			System.out.printf("%15f",data.getWeight());
			
			System.out.println();
			try{
				Thread.sleep(500);
			}catch(Exception e){
				}
			}
		}
	}
	
	
}
