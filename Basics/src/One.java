
public class One {
	public int p=10; //instance variable
	public static int r=90;//static variable
	public void m1() {
		System.out.println("instance method");
	}
	public static void m2() {
		System.out.println("static method");
	}
	

	public static void main(String[] args) {
		System.out.println(One.r);
		One.m2();
		One o=new One();
		System.out.println(o.p);
		o.m1();
		
	}

}
