import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int nxt=0;
	int t1=0;
	int t2=1;
	for(int i=0;i<n;i++)
	{
		
		nxt=t1+t2;
		t1=t2;
		t2=nxt;
	}
	System.out.print(t1);

	
}
	
}
