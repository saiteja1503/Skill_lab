package oppsskill;
import java.util.Scanner;

public class perfectNumber {
	public static void main(String[] args) {
		int n,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number=");
		n = sc.nextInt();
		for (int i = 1; i < n; i++)
		{
			if (n % i == 0)
			{
				sum = sum + i;
			}}
		if (n== sum)
		{
			System.out.println("perfect Number");
		}else {
			System.out.println(" Not  a perfect Number");
			
		}
	}

}
