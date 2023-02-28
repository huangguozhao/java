public class MethodParaneter02{

	public static void main(String []args){

		int[] arr = {1,2,3};
		B b = new B();
		b.test100(arr);
		System.out.println("After the change: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

class B{
	public void test100(int[] arr)
	{
		System.out.println("Before the change: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		arr[0] = 100;
	}
}