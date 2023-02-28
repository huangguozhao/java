public class MethodExercise02{

	public static void main(String[]args){
		Person p = new Person();
		p.name = "Mary";
		p.age = 20;
		Copy copy = new Copy();
		Person q = new Person();
		q = copy.copyPerson(p);
		System.out.println("p.name=" + p.name + "p.age=" + p.age);
		System.out.println("q.name=" + q.name + "q.age=" + q.age);
	}
}

class Person{
	String name;
	int age;
}

class Copy{
	public Person copyPerson(Person p){
		Person q = new Person();
		q.name = p.name;
		q.age = p.age;
		return q;
	}
}