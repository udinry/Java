import java.util.Scanner;
public class FtoCTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		int i=S;
		
		while(i<=E)
		{
			System.out.print(i);
			System.out.print("\t");
			System.out.println(5*(i-32)/9);
			i=i+W;
		}
		
	}

}
