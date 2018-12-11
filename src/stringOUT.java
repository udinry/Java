import java.util.Scanner; 
public class stringOUT 
{ 
    public static void main(String[] args) 
    { 
    	Scanner s = new Scanner(System.in);
    	String str = s.next();
    	int i=s.nextInt();
    	int j=s.nextInt();
    	int k=s.nextInt();
    	int l=(i+j+k)/3;
    	System.out.println(str);
    	System.out.println(l);
    }
} 