import java.util.Scanner;
public class Print2TONPrime {
public static boolean isprime(int n)
{
	int i=2;
	while(i<n)
	{
		if (n%i==0)
		{
			return false;
		}
		i++;
		
	}
	return true;
}
public static void printprime(int n)
{
	for (int i=2;i<=n;i++)
	{
		boolean eyo=isprime(i)
				;
		if (eyo==true) System.out.println(i);
		
	}
	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printprime(n);
		s.close();
		
		
		
	}

}
