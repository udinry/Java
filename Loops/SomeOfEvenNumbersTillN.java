import java.util.Scanner;
public class SomeOfEvenNumbersTillN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		int Sum=0;		
		while(i<=n)
		{
			if(i%2==0)
			{
				Sum=Sum+i;
			}
			i++;
			
		}
		System.out.println(Sum);
	}
	

}
