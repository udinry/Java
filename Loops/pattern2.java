import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int val=1;
		int l=0;
		while(i<=n)
		{
			int space=1;
			while(space<=n-i)
			{
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			while(j<=i)
			{
				
				System.out.print(val);
				val=val+1;
				j++;
			}
			
			val=val-l;
			l=l+1;
			System.out.println();
			i++;
		}
		
		
	}

}
