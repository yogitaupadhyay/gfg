public class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	Float perc;
	Student(int id ,String name,int age,Float perc){
		this.id=id;
		this.name=name;
		this.age=age;
		this.perc=perc;
	}
	@Override
	public String toString(){
		return "id= "+id+"name= "+name+"age= "+age+"perc= "+perc;
	}
	@Override
	public boolean equals(Object obj){
		if(obj==null) return false;
		if(obj==this) return true;
		if(obj instanceof Student){
			Student s=(Student)obj;
			if(s.id==id){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode(){
		return id;
	}
	@Override
	public int compareTo(Student other) {
		if(this.id>other.id) {
			return -1;
		}else if(this.id<other.id) {
			return +1;
		}else {
			return 0;
		}
	}
}