class Final{
	final void display() {
		System.out.println("final method");
	}
}
public class FinalExample extends Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f=new Final();
		f.display();
	}

}
