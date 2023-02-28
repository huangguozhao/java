import java.util.Scanner;

public class Recursion01{

	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number :");
		int a = s.nextInt();
		T t = new T();
		t.test(a);
		System.out.print("请输入一个数：");
		int b = s.nextInt();
		int c = t.factorial(b);
		System.out.println("结果是" + c);
	}
}

class T{
	public void test(int n){
		if(n>2)
		{
			test(n-1);
		}
		System.out.println("n=" + n);
	}
	public int factorial(int n){
		int res=1;
		if(n>1)
		{
			res*= factorial(n-1)*n;
		}
		else if(n==1||n==0)
		{
			res = 1;
		}
		return res;
	}
}