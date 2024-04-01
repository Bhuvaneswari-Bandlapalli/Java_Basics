
public class ArrayOne {

	public static void main(String[] args) {
		String arr1[]= {"A","B","C","D"};
		String arr2[]= {"P","Q","A","D"};
		int i=0;
		while(i<arr1.length) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])){
					System.out.println(arr1[i]+"-"+j);
					}
				
			}
			
				System.out.println(arr1[i]+"-"+"NA");
		
			
				i=i+1;
				
				
			}
		
		}
		
		
	}


