package methods;

public class methoddemo {

	int a=23;
	int b=45;
	
	public int add() {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public int sub() {
		int c=a-b;
		System.out.println(c);
		return c;
	}
	public void mul() {
		int c=a*b;
		System.out.println(c);
	}
	
public static void main(String[] args) {
	methoddemo m=new methoddemo();
	m.add();
	m.sub();
}
}
