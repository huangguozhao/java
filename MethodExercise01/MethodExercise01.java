import java.util.Scanner;

public class MethodExercise01{

	public static void main(String[]args){
		Scanner p = new Scanner(System.in);
		System.out.print("Please enter the number:");
		int n = p.nextInt();
		AA a = new AA();
		boolean b = a.judge(n);
		if(b)
		{
			System.out.println("The number is even number.");
		}
		else
		{
			System.out.println("The number is odd number.");
		}

		System.out.print("Please enter the number of line :");
		int one = p.nextInt();
		System.out.print("Please enter the number of column:");
		int two = p.nextInt();
		System.out.print("Please enter the character:");
		char three = p.next().charAt(0);
		a.print(one ,two,three);
	}
}

class AA{
	public boolean judge(int n){
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void print(int a,int b,char c){
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}