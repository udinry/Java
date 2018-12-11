import java.util.Scanner;
public class nCr_FunctionSe {
	

	
public static int factorial(int n)
{
	int ans= 1;
	for (int i=1;i<=n;i++)
	{
		ans=ans*i;
	}
	return ans;
}
public static void ncrr(int n, int r)
{
	boolean prime =false;
	
	
	int num=factorial(n);



	int numr=factorial(r);


	int numn=factorial(n-r);

prime=isPrime(n);
if(prime==true)
{
	System.out.println("Prime Number ");
}
else
{
	System.out.println("Not a prime number");
}




System.out.print((num)/(numr*numn));
}



public static boolean isPrime(int k)
{
	int count=0;
	boolean isPrime=false;
	for(int i=1;i<k;i++)
	{
		if(k%i==0)
		{
			count++;
		}
		
	}
	if(count==1)
	{
		isPrime=true;
	}
	return isPrime;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int r=s.nextInt();
		ncrr(n,r);
//		boolean prime =false;
//		
//		
//			int num=factorial(n);
//		
//		
//		
//			int numr=factorial(r);
//		
//		
//			int numn=factorial(n-r);
//		
//		prime=isPrime(n);
//		if(prime==true)
//		{
//			System.out.println("Prime Number ");
//		}
//		else
//		{
//			System.out.println("Not a prime number");
//		}
//		
//		
//		
//		
//		System.out.print((num)/(numr*numn));
	}

}
