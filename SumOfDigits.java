package week1.day2.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int digits= 123,remainder,sum =0;
		while (digits > 0)
		{
		   remainder = digits%10;
		   System.out.println("The remainder of the digits is "+remainder);
		   digits = digits/10;
		   System.out.println("The quotient of the digits is "+digits);
		   sum = sum + remainder;
		   System.out.println("The sum of the digits is "+sum);
		   
		}

	}

}
