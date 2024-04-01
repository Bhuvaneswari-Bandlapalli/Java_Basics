
public class Two {
	int a=12;
	static int b=12; 
	
	public static void main(String[] args) {
		Two t=new Two();
		System.out.println(t.a);
		System.out.println(b);

		t.a=14;
		b=14;
		System.out.println(t.a);
		System.out.println(b);
		Two t1=new Two();
		System.out.println(t1.a);
		System.out.println(b);
	}

}
