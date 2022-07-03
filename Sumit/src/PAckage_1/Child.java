package PAckage_1;

public class Child extends Parent{
		
		public void child() {
			System.out.println("i am child default method");
		}
		public void child(int a) {
			System.out.println("i am child one parameterized method");
		}
		public void child(int a,int b) {
			super.abc(1, 2);
			System.out.println("i am child two parameterized method");
		}
		public void child(int a,int b,int c) {
			this.child(1, 2);
			this.child();
			this.child(1);
			System.out.println("i am child three parameterized method");
		}
		public static void main(String[] args) {
			Child c=new Child();
			c.child(1, 2, 3);
		}
}
