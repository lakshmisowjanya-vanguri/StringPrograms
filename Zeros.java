import java.util.*;
class Zeros1 {
	int a=10;
//	System.out.println(a);
	void check() {

		
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of elements");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count]=a[i];
				count++;
			}
		}
		while(count<a.length) {
			a[count]=0;
			count++;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
public class Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zeros1 z=new Zeros1();
		z.check();
	}

}
