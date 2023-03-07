public class OverLoadExercise{
	public static void main(String[]args){
		Methods me = new Methods();
		me.m(2);
		me.m(2,5);
		me.m("string");
	}
}

class Methods{
	public void m(int n){
		System.out.println(n*n);
	}

	public void m(int n1,int n2){
		System.out.println(n1*n2);
	}

	public void m(String s){
		System.out.println(s);
	}
}