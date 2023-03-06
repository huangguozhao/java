public class daffodil02{
	public static boolean Judge(int n){
		return (Math.pow(n/100,3)+Math.pow(n/10%10,3)+Math.pow(n%10,3)==n)?true:false;
	}
	public static void main(String[]args){
		for(int i=100;i<1000;i++)
		{
			if(Judge(i))
			{
				System.out.println(i);
			}
		}
	}
}