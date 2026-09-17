public class Hello{
	public static void main(String args[]){
		Student studentA=new Student();
		studentA.age=18;
		studentA.name="xiaohai";
		studentA.hello();
	}
}

class Student{
	int age;
	String name;
	public void hello(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
}