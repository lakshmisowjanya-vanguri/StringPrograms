
  abstract class Employee2{
	protected	String name;
	protected int number;
	protected int salary;
	public Employee2(String name,int number,int salary){
		this.name=name;
		this.number=number;
		this.salary=salary;
	}
	 abstract void salary();
}
  class Contract1 extends Employee2{
	public Contract1(String name,int number,int salary){
		super(name,number,salary);
	}
	void salary() {
	
		System.out.println("name is"+name +"number :"+number +"salary is"+salary);
	}
}
public class AbstractExample extends Employee2{
	
 AbstractExample(String name,int number,int salary){
		super(name,number,salary);	
  }	
	 void salary() {
	
		System.out.println("name is"+name +"number :"+number +"salary is"+salary);
	}
	public static void main(String k[]) {
		Contract1 c=new Contract1("b",2,150);
		AbstractExample e=new AbstractExample("a",1,300);
	e.salary();
	c.salary();
}
}