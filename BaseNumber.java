import java.util.*;
class Number {
	void check(int n1,int n2) { 
		if(n1%2==0) {
			System.out.println(n1);
			n1++;
			if(n1<n2) {
				check(n1,n2);
			}
		}
		else {
			n1++;
			check(n1,n2);	
			}
	}
}
public class BaseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		int n1=s.nextInt();
		int n2=s.nextInt();
		Number n=new Number();
		n.check(n1, n2);
		
	}

}
