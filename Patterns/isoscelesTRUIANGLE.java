import java.util.Scanner;
public class isoscelesTRUIANGLE {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
