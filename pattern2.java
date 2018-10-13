/*
 * @author Jereemi
 * 
 * pattern printing
 */
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for (int i = 0; i < rows; i++) {
			// this variable is for storing the value for each row
			int a = 0;
			for (int j = 0; j <= i; j++) {
				// printing row wise
				System.out.print(a + 1);
				// incrementing the value
				a++;
			}
			// for jumping to the next row
			System.out.println();
		}
		//closing the used resources
		sc.close();
	}

}

output:
Enter the number of rows: 
5
1
12
123
1234
12345
