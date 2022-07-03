package PAckage_1;

public class Parent {

	
	public void abc() {
		
		System.out.println("i am parent default method");
		
	}
	public void abc(int a) {
		
		System.out.println("i am parent one parameterized method");
		
	}
	public void abc(int a,int b) {
		this.abc(1, 2, 3);
		this.abc();
		this.abc(1);
		System.out.println("i am parent two parameterized method");
		
	}
	public void abc(int a,int b,int c) {
		
		System.out.println("i am parent three parameterized method");
		
	}
}
