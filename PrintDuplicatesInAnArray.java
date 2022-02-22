package week1.day2.assignments;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,12};
		int arrLength = arr.length;
		int count;
		for(int i=0;i<arrLength;i++) {
			count=0;
			{
				for(int j=i+1;j<arrLength;j++) {
					if (arr[j]==arr[i])
					{ 
						count++;	
						break;
					}	
				}
				if( count > 0)
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
