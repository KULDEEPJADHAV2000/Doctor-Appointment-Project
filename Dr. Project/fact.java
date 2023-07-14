package factorial;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the any number :");
		
		int number=sc.nextInt();
		long Factorial= calculateFactorial(number);
		
		System.out.println("factorial of " + number + "is:" + Factorial);
	}

	private static long calculateFactorial(int number) {
		// TODO Auto-generated method stub
		if(number==0 || number==1)
		{
			return 1;
		}else
		{
		return number*calculateFactorial(number-1);
		}
	}

}
