
public class GetGC {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		long tm=r.getRuntime().totalMemory();
		long fm=r.getRuntime().freeMemory();
		System.out.println("total Memeory: "+tm);
		System.out.println("free memory: "+fm);
		System.out.println("used memory:  "+(tm-fm));
		
      System.out.println("---------------------------------");
      for(int i=0;i<=100000;i++) {
    	  Product p=new Product(1,"nuts",890.90);
    	 p=null;
      }
      System.gc();
      Runtime r1=Runtime.getRuntime();
		long tm1=r1.getRuntime().totalMemory();
		long fm1=r1.getRuntime().freeMemory();
		System.out.println("total Memeory: "+tm1);
		System.out.println("free memory: "+fm1);
		
		System.out.println("used memory:  "+(tm1-fm1));
	}

}
