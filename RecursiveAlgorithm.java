package Week2.java;

import java.util.Arrays;

public class RecursiveAlgorithm {
	static int factorialusingRecursive(int m)
	{
		if(m == 0)
		{
			return 1;
		}
		else
		{
			return (m* factorialusingRecursive(m-1));
		}
	}
	static int sumFrom1ToN(int a)
	{
		int result =0;
		for(int b =0; b<=a; b++)
		{
			result += sum(b);
			
		}
		return result;
	}
	static int sum(int n)
	{
		int sum =0;
		while(n!=0)
		{
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	static int find(int binary)
	{
		if (binary ==0)
		{
			return 0;
		}
		else
		{
			return(binary %2 +10 *find(binary/2));
		}
	}
		
		
	
	public static void main(String[] args) {
		int i, factorial =1;
		int num = 5;
		factorial = factorialusingRecursive(num);
		System.out.println("Factorial of "+ num+" is "+ factorial);
		System.out.println("Sum of "+ num+" from 1 to n is "+sumFrom1ToN(num));
		int [] num1 = {1,2,3,4,5};
		int sum1 =0;
		for(int j= 0; j<num1.length; j++)
		{
			sum1 += sum1+j; 
		}
		System.out.println("Sum array 1 to 5: "+ sum1);
		int firstTerm =0, secondTerm =1;
		System.out.println("Fibonacci Series: "+ num) ;
		while(firstTerm <= num)
		{
			System.out.print(firstTerm+ " ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
		secondTerm = nextTerm;
			
		}
		int binary =55;
		System.out.print("\n----------------------");
		System.out.print("\nBiany: "+ find(binary));
		
	}
	

}
