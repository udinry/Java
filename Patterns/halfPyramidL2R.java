import java.util.Scanner;
public class halfPyramidL2R {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int val=1;
		int t=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(val);
				val=val+1;
			}
			val=val-t;
			t++;
			System.out.println();
		}

	}

}
