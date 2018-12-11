import java.util.Scanner;

public class dskj
{

 public static void main(String[] args) 
 {
  
  double t_sal,allow;
  
  Scanner s = new Scanner(System.in);
  //System.out.println("enter the basis amount of salary");
  double basic = s.nextInt();
  //System.out.println("enter any chr for give grade");
  char grade = s.next().charAt(0);
  
  double hra = ((basic*20/100.0));
 // System.out.println("hra is "+hra);
  double da = ((basic*50/100.0));
 // System.out.println("da is "+da);
  double pf = ((basic*11/100.0));
 // System.out.println("pf is "+pf);
  
  
  if(grade == 'A')
  {
   allow = 1700;
  }
  
  else if(grade == 'B')
  {
   allow = 1500;
   
  }
  else
  {
   allow = 1300;
   
  }
  
  t_sal = basic + hra + da + allow - pf;
  //System.out.println("total salary is "+t_sal);
   System.out.println(Math.round(t_sal));

  
   
 }

}
