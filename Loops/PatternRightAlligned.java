import java.util.Scanner;
public class PatternRightAlligned {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int val=1;
		
		while(i<=n)
		{
			int k=0;
			int j=1;
			
			while(k<n-i)
			{
				System.out.print(" ");
				k=k+1;
			}
			while(j<=i)
			{
				
				System.out.print(val);
				val=val+1;
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
