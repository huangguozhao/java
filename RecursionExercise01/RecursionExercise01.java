import java.util.Scanner;

public class RecursionExercise01{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Recursion p = new Recursion();
		if(n<1)
		{
			System.out.println("�������Ӧ����0.");
		}
		else
		{
			System.out.println("쳲���������"+n+"��"+p.fibonacci(n));
		}
		n = s.nextInt();
		if(n>=1&&n<=10)
		{
			System.out.println("���ӵ�������" + p.peachSum(n));
		}
	}
}

class Recursion{
	public int fibonacci(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public int peachSum(int n)
	{
		if(n==10)
		{
			return 1;
		}
		else
		{
			return (peachSum(n+1)+1)*2;
		}
	}
}