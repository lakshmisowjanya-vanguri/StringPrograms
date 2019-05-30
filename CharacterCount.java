import java.util.*;
class CharacterCount1 {
	void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String st=s.nextLine();
		String str=st.toUpperCase();
		int l=str.length();
		char ch[]=new char[l];
		for(int i=0;i<l;i++) {
			ch[i]=str.charAt(i);
		}
		for(int i=0;i<l;i++) {
			int count=0;
			for(int j=i+1;j<l;j++) {
				if(ch[i]==ch[j]) {
					ch[i]=ch[l-1]; 
					j--;
					l--;
					count++;
				}
			}
			System.out.println(ch[i]+":"+" "+(count+1));
		}
	}
}
class CharacterCount {
	public static void main(String k[]) {
		CharacterCount1 d=new CharacterCount1();
			d.display();
	}
}
