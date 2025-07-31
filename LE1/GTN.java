import java.util.Scanner;
public class GTN{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("The maximum number is:  "+ Math.max(num1, num2));
	}
}