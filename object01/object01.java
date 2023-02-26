import java.util.Scanner;

public class object01{

	public static void main(String[]args){
		Cat cat1 = new Cat();
		cat1.name = "white";
		cat1.age = 12;
		cat1.color = "white";
		System.out.println("The name of the cat is "+ cat1.name + ". " +"The age is " + 
			cat1.age + "." + "The color is " + cat1.color + ".");
		cat1.speak();

		getSum sum = new getSum();
		sum.getSum01();
		int returnres = sum.getSum02();
		System.out.println("The result two is " + returnres);
		int returnres02 = sum.getSum03(5);
		System.out.println("The result three is " + returnres02);
		int returnres03 = sum.getSum04(1,1000);
		System.out.println("The result four is " + returnres03);

		int[] returnres04 = sum.getSum05(9,2);
		System.out.println("The result five is " + returnres04[0]);
		System.out.println("The result six is " + returnres04[1]);

	}
}

class Cat{

	String name ;
	int age;
	String color;
	public void speak(){
		System.out.println("miaomiao~");
	}
}

class getSum{
	public void getSum01(){
		int res = 0;
		for(int i = 1;i<=1000;i++)
		{
			res += i;
		}
		System.out.println("The result is " + res);
	}

	public int getSum02(){
		int res = 0;
		for(int i=1;i<=1000;i++)
		{
			res +=i;
		}
		return res;
	}

	public int getSum03(int n)
	{
		int res = 0;
		for(int i =1;i<=n;i++)
		{
			res += i;
		}
		return res;
	}

	public int getSum04(int a,int b){
		int res = 0;
		for(int i = a;i<=b;i++)
		{
			res += i;
		}
		return res;
	}

	public int[] getSum05(int c,int d)
	{
		int[] res = new int[2];
		res[0] = c+d;
		res[1] = c-d;
		return res;
	}
}