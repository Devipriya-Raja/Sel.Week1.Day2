package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8,firstNum=0,secNum=1;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1;i<=range;i++)
		{
			int sum = firstNum+secNum;
			firstNum = secNum;
			secNum= sum ;
			System.out.println(sum);
		}

	}

}
