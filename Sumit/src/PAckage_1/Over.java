package PAckage_1;

public class Over {
	

	

	public void sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println("sum is" +c);
		
	}
	public void sum(int a,int b,int d) {
		int c;
		c=a+b+d;
		System.out.println("sum is" +c);
		
	}
	
	public static void main(String[] args) {
		Over O=new Over();
		O.sum(2, 3);
	}
}


