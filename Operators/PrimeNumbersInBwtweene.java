import java.util.Scanner;
public class PrimeNumbersInBwtweene {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		int count=0;
		
		
		
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				if(i%j==0)
				{
					++count;
				}
				else
				{
					continue;
				}
				j++;
			}
			if(count==1)
			{
				System.out.println(i);
			}
			
				i++;
				
		}	
		
		}
	}


