public class daffodil03{
	public static void main(String[]args){
		A a = new A();
		for(int i=100;i<1000;i++)
		{
			if(a.Judge(i))
			{
				System.out.println(i);
			}
		}
	}
}

class A{
	public boolean Judge(int i)
	{
		return (Math.pow(i/100,3)+Math.pow(i/10%10,3)+Math.pow(i%10,3)==i)?true:false;
	}
}