import java.util.Scanner;
public class mario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height,please: ");
		int height = sc.nextInt();
		sc.close();
		System.out.println("Height= " + height);
	    for (int i = 0; i <= height; i++) {
	        for (int j = 0; j < i; j++) {
	          System.out.print("# ");
	        }
	        System.out.println();
	      }		
	}
}