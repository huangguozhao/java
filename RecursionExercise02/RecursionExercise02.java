import java.util.Scanner;
public class RecursionExercise02{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = 3;
		T t = new T();
		t.step(n,'A','B','C');
	}
}

class T{
	public void step(int n,char a,char b,char c)
	{
		if(n==1)
		{
			System.out.println(a + "->" + c);
		}
		else
		{
			step(n-1,a,c,b);
			System.out.println(a + "->" + c);
			step(n-1,b,a,c);
			
		}
	}
}