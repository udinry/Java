import java.util.Scanner;
public class StarFullPyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
				
			}
			
			for (int j=1;j<=i+temp;j++)
			{
				System.out.print("*");
			}
			temp++;
			System.out.println();
		}
	}

}
