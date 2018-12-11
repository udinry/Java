import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		while(i<n-1)
		{
			if(n%i==0)
			{
				System.out.println("Not a Prime No.");
				return;
			}
			else
			{
				i++;
			}
			
		}
		System.out.println("Prime No.");

	}

}
