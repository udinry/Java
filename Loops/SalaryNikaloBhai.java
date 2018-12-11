import java.util.Scanner;
public class SalaryNikaloBhai {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		String str=s.next();
		char g=str.charAt(0);
		double hra=S*20/100;
		double da=S*50/100;
		double pf=S*11/100;
		int allow;
		if(g=='A')
		{
			 allow=1700;
		}
		else if(g=='B')
		{
			 allow=1500;
		}
		else
		{
			 allow=1300;
		}
		int T=(int)(S+hra+da+allow-pf);
		System.out.print(T);
		

	}

}
