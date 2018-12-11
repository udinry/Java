import java.util.Scanner;
public class Solution {

	
	public static int[] arrange(int n){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/		
  
     
      
    //  int temp=n;
		int  temp=1;
	     
		int arr[]=new int[n-1];
		      for(int i=1;i<n-1;i++)
		      {
		        if(i%2==1)
		        {
		          arr[i-1]=temp;
		          temp++;
		        }
		        else
		        {
		          arr[n-2]=temp;
		          n--;
		          temp++;
		        }
		      }
		      
		 
		      return arr;
		      
		      
			}
  
  public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
   int n=s.nextInt();
    int arr[]=new int [n-1];
      arr=arrange(n-1);
    for (int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    
  
  }
}
