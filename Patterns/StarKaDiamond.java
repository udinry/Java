import java.util.Scanner;
public class StarKaDiamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		
	      int n1=(n+1)/2;
	      int space = n1 - 1;
        // run loop (parent loop)  
        // till number of rows 
        for (int i = 0; i < n1; i++) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i+1 stars 
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space--; 
        } 
      
        // Repeat again in 
        // reverse order 
        space = 0; 
      int n2=n/2;
        // run loop (parent loop)  
        // till number of rows 
        for (int i = n2; i > 0; i--) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i stars 
            for (int j = 0; j < i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space++; 
        } 
	}

}
