import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		System.out.println('1');
		while(i<=n)
		{
		//	int j=1;
		//	while(j<=i)
			//{
				System.out.print(i);
				int k=0;
				while(k<=i-2)
				{
					System.out.print('0');
					k=k+1;
				}
				
			//	j++;
			//}
				System.out.print(i);
			System.out.println();
			i++;
		}

	}

}
