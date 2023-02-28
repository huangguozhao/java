import java.util.Scanner;

public class MethodParaneter01{

	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number a : ");
		int a = s.nextInt();
		System.out.print("Please enter the number b : ");
		int b = s.nextInt();
		AA p = new AA();
		System.out.println("Before using the Method swap:");
		p.swap(a,b);
		System.out.println("After using the Method swap:\na=" + a + "\tb=" + b);
	}
}

class AA{

	public void swap(int a,int b){

		System.out.println("a="+a+"\tb="+b);
		int t;
		t = a;
		a = b;
		b = t;
		System.out.println("a="+a+"\tb="+b);
	}
}