import java.util.*;
class Remove{
	void space() {
		int count=0,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
			for(i=0;i<ch.length;i++) {
				if(ch[i]==' ') {
					count++;
					ch[i]=(char)(count+'0');
				}
				System.out.print(ch[i]);
			}
	}
	}

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove r=new Remove();
		r.space();
	}

}
