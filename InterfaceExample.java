interface I{
	int i=10;
	void display1();
}
interface I2{
	void run();
}
class C{
	int a=10;
	void add() {
		int c=a+a;
		System.out.println(c);
	}
}
public class InterfaceExample extends C implements I,I2 {
	public void display1() {
		
	}
	public void run() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample i=new InterfaceExample();
		i.add();
	}
	
	
		
	}


