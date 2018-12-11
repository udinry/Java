import java.util.Scanner;
public class CharUprORlwr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str= s.nextLine();
		char c=str.charAt(0);
		if(c>=65&&c<97)
		{
			System.out.println("1");
		}
		else if(c>=97&&c<123)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("-1");
		}

	}

}
