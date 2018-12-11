import java.util.Scanner;
public class FunctionSEfTOcTable {
	public static void printFahrenheitTable(int start,int end,int step)
	{
int i=start;
		
		while(i<=end)
		{
			System.out.print(i);
			System.out.print("\t");
			System.out.println(5*(i-32)/9);
			i=i+step;
		}
		
		
	}

	public static void main(String[] args) {				
		//Scanner se=new Scanner(System.in);
		
			Scanner se=new Scanner(System.in);
		int S=se.nextInt();
		int E=se.nextInt();
		int W=se.nextInt();
		printFahrenheitTable(S,E,W);
		se.close();
		
		
	}

}
