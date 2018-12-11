import java.util.Scanner;
public class FibonacciHaiBhikinahi {
	public static boolean checkMember(int n)
	{
		int i=0;
		int j=1;
		int temp=0;
		int k;
		boolean isF=false;
		for(k=0;k<=n;k++)
		{
			if (n==temp||n==i)
			{
				isF=true;
			}
			temp=i+j;
			i=j;
			j=temp;
			
		}
		if(isF)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean isFey;
		int n=s.nextInt();
		isFey=checkMember(n);
		if(isFey)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		s.close();

	}

}
