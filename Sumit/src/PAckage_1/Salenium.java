package PAckage_1;

public class Salenium extends Automation {
	
	 public Salenium() {
		 super(2,3);
		System.out.println("i am child default constructor");
	}
	 public Salenium(int a) {
		 this(2,2);
			System.out.println("i am child one parameterized constructor");
		}
	 public Salenium(int a,int b) {
		 this(1,2,3);
			System.out.println("i am child two parameterized constructor");
		}
	 public Salenium(int a,int b,int c) {
		 this();
			System.out.println("i am child three parameterized constructor");
		}
	 public static void main(String[] args) {
		Salenium s=new Salenium(1);
	}
}
