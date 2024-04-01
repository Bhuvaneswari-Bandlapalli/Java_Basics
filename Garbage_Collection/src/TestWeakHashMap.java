import java.util.WeakHashMap;

public class TestWeakHashMap {

	public static void main(String[] args) {
		Customer c=new Customer(1,"bhuvana","hyd");
		Customer c1=new Customer(2,"sony","zhd");
		WeakHashMap<Customer,Integer> w=new WeakHashMap<>();
	    w.put(c, 1)	;
	    w.put(c1,2);
	    System.out.println(w);
	    c=c1;
	    try {
	    	Thread.sleep(12000);
	    	
	    }catch(Exception e){
	    	System.out.println(e);
	    	
	    }
	    System.gc();
	   
	    System.out.println(w);
	    }

}
