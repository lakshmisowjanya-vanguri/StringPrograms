import java.util.*;
class Permutation {
	void permute(String str,int l,int r) {
		if(l==r) { 
			System.out.print(str +" ");
		}
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	String swap(String a,int i,int j) {
		char temp;
		char ch[]=a.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
		
	}
}
public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		int n=str.length();
		Permutation p=new Permutation();
		p.permute(str,0,n-1);
		
	}

}
