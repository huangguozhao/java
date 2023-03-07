public class OverLoadExercise02{
	public static void main(String[]args){
		Methods m = new Methods();
		System.out.println(m.max(1,2));
		System.out.println(m.max(1.5,5.1));
		System.out.println(m.max(2.4,5.1,7.3));
	}
}

class Methods{
	public int max(int n1,int n2){
		return n1>n2?n1:n2;
	}

	public double max(double n1,double n2)
	{
		return n1>n2?n1:n2;
	}

	public double max(double n1,double n2,double n3){
		return n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
	}
}