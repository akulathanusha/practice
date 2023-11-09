package decrementingfor;
import java.util.Scanner;
public class DecrementingFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Range");
		int num = scan.nextInt();
		for(int i=num; i>=1; i--) {
			System.out.println("The sum is " + i);
		}
	}

}
