package PAckage_1;

public class Automation {
	public Automation() {
		this(1,2,3);
		System.out.println("i am parent default contructor");
		
	}
	public Automation(int a) {
		this();
		System.out.println("i am parent One Parameterised contructor");
		
	}
	public Automation(int a,int b) {
		this(1);
		System.out.println("i am parent Two Parameterised contructor");
		
	}
	public Automation(int a,int b,int c) {
		System.out.println("i am parent Three Parameterised contructor");
		
	}
}
