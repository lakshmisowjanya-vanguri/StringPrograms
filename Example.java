abstract class Employee{
private	String name;
	int number;
	int salary;
	Employee(String name,int number,int salary){
		this.name=name;
		this.number=number;
		this.salary=salary;
	}
	abstract void salary();
	void display() {
		
		System.out.println("salary per month is "+salary+" name "+name+" number "+number);
	}
}
class Contract extends Employee{
	Contract(String name,int number,int salary){
		super(name,number,salary);
	}
	void salary() {
		salary=salary*15;
		super.display();
	}
}
public class Example extends Employee{
	//int day=30;
	Example(String name,int number,int salary){
		super(name,number,salary);	
		//his.day=day;
	}
	void salary() {
		salary=salary*30;
		super.display();
	}
	public static void main(String k[]) {
		Contract c=new Contract("b",2,150);
	Example e=new Example("a",1,300);
	e.salary();
	c.salary();
}
}
