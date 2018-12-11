import java.util.Scanner;
public class CharacterPatterns {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	char StartingChar=(char)('A'+i-1);
	for(int j=1;j<=n;j++)
	{
		System.out.print(StartingChar);
		StartingChar=(char)(StartingChar+1);
	}
	System.out.println();
}
	}

}
