
public class One {
	public void finalize() {
		 
		System.out.println("finalize method is called");
		System.out.println("finalize call"+(10/0));
	}

	public static void main(String[] args) {
		One h=new One();
		h.finalize();
		System.gc();
		System.out.println("its end");
		
	}

}
