package supperkeyword;

public class ChildClass extends ParentyClass{
	
	int x=20;

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.display();

	}
public void display() {
	System.out.println(x);                      //childclass
	System.out.println(super.x);                //parentclass
	
}
	
}
