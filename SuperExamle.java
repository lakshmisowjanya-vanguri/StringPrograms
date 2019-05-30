class A{
	 int a=10;
	A(int a){
		System.out.println("aconstructor "+a);
	}
	void display1() {
		super.toString();
		System.out.println("a method ");
	}
}
class B extends A{
	B(){
		super(1);
	}
	void display1() {
		super.display1();
		System.out.println(" b method "+super.a);
		super.display1();
	}
}
public class SuperExamle extends B {
	void display() {
	super.display1();
	}
public static void main(String k[]) {
	SuperExamle s=new SuperExamle();
	s.display();
}
}
