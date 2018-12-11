import java.util.Scanner;
public class solution {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	char StartingChar=(char)('A'+n-1);
	for(int j=1;j<=i;j++)
	{
		System.out.print(StartingChar);
		StartingChar=(char)(StartingChar-1);
	}
	System.out.println();

	}

}
}
