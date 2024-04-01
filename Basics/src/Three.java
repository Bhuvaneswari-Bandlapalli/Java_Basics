
public class Three {
	int i=90;
	static int r=20;
	static 
	{
		System.out.println("i am static block "+r);
	}
	{
		System.out.println("i am instance block "+i+" "+r );
	}

	public static void main(String[] args) {
		
		Three t=new Three();

	}

}
