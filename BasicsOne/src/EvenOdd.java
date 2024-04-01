import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Integer number: ");
		int num=sc.nextInt();
		if((num>=1 && num<=1000 )){
			if(num%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
			

	}

}
