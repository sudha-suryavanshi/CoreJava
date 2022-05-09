package onlineVideo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{
		int num1,num2;
		int sum=0;
		System.out.println("Enter the First Number:");
		
		
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		
		System.out.println("Enter the Second Number:");
        num2=sc.nextInt();
        
        sum=num1+num2;
        System.out.println("Sum of"+num1+" and " +num2+ "is :" +sum);
	}

}
