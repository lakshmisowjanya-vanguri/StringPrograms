import java.util.*;
class Equal{
	void display() {
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter array length");
		int p=s.nextInt();
		int n1[]=new int[p];
		System.out.println("enter array length");
		int q=s.nextInt();
		int n2[]=new int[q];
		for(int i=0;i<n1.length;i++) {
			n1[i]=s.nextInt();
		}
		for(int i=0;i<n2.length;i++) {
			n2[i]=s.nextInt();
		}
		if(n1.length==n2.length) {
			for(int i=0;i<n1.length;i++) {
				for(int j=0;j<n2.length;j++) {
					if(n1[i]==n2[j]) {
						c++;
					}
				}
			}
			if(c==n1.length) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
				}
		} 
	}
}
public class ArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equal e=new Equal();
		e.display();
		
	}

}
