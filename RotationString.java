import java.util.*;
class Rotation {
	boolean display() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=s.nextLine();
		System.out.println("enter second string");
		String str2=s.nextLine();
		if((str1+str1).contains(str2)) {
			return true;
		} else {
			return false;
			}
		
	}
}
public class RotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotation r=new Rotation();
		boolean b=r.display();
		System.out.println(b);
	}
}
