
public class PassByValue {
//public static void increment(int n)
//{
//	n++;
//}
//	public static void main(String[] args) {
//	int a =10;
//	increment(a);
//	System.out.println(a);
//
//	}
	
	
	public static int func(int a){
	    a += 10;
	    return a;
	}

	public static void main(String[] args) {
	    int a = 5;
	    func(a);
	    System.out.println(a);
	}

}
