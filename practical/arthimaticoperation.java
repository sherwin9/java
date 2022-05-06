package sherwin;

import java.util.Scanner;

public class arthimaticoperation {
	public static void main(String args[]) {
//create scanner class object
	Scanner sc = new Scanner(System.in);
	
	//Input 2 numbers from user
	System.out.println("enter the first number: ");
	int num1 = sc.nextInt();
	System.out.println("enter the second number");
	int num2 = sc.nextInt();
	
	
	
	//Perform arithmetic operations
	int sum = num1 + num2;
	int diff = num1 - num2;
	int mul = num1*num2;
	int div = num1/num2;
	int mod =num1%num2;
	
    //Print result to console
    System.out.println("sum:"+sum);
    System.out.println("difference: "+diff);
    System.out.println("multiplication:"+mul);
    System.out.println("Division:"+div);
    System.out.println("modulus:"+mod);
    
}



	
}
