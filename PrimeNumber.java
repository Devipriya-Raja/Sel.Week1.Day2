package week1.day2.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		int hI = input/2;
		if (input==0 || input==1)
		{
			System.out.println("The number " +input+" is not prime number");   
		}
		for (int i=2;i<=hI;i++)
		{
            int j =  input%i;
            if (j==0)
            {
            	flag=true;
                break;
            }
	    }
		if (flag == true)
			System.out.println("The number " +input+" is a not prime number");
		else 
			System.out.println("The number " +input+" is a prime number");
	}
}
