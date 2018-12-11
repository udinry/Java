import java.util.Scanner;
public class powernikalo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int i=1;
		int k=1;
		while(i<=n)
		{
			k=k*x;
		}
		System.out.print(k);

	}

}
