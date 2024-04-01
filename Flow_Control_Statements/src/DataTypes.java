
public class DataTypes {
	
	
	public static void main(String[] args) {
		//memory size,type of variable=>data type
		//primitive and non-primitive
		/*primitive stores single value
		 * 
		 * primitive =>conditional==boolean(true/false)
		 * 				Character ==char--store single character
		 * 				Integer==byte,short,int,long
		 * 				Float==float,double
		 * non-primitive=>store complex objects(date,mail mesg)
		 * ex:-String,Class,Array,Interface
		 * 
		 * 
		 */
		byte h=10;		//-128 to +127    =>1 byte
		short h1=20000;  //-2**15 to (2**15)-1  =>2bytes
		int h2=2000000;		//-2**31 to (2**31)-1  =>4bytes
		long j=100000000;   //-2**63 to (2**63)-1  =>8bytes
		
		
		float p=90.099999f;    //6 to 7 decimal digits(round)=>4 bytes
		double d=50.990009887; //15 decimal digits(accurate)=>8 bytes
		
		boolean b=true;      //1 bit
		char c='a';          // 2 bytes
		char c1=127;         //97 --a; 67 --A(take +ve values only)
		
		String s="hi bhuvana";
        System.out.println(h);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(j);
        System.out.println("----------decimal---------");
        System.out.println(p);
        System.out.println(d);
        System.out.println("-----------bolean----");
        System.out.println(b);
        System.out.println("-----------char------------");
        System.out.println(c);
	}

}
