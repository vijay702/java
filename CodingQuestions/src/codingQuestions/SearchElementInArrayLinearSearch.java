package codingQuestions;

public class SearchElementInArrayLinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {10,5,2,44,5,6};
		
		int target =44;
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i] == target) {
				
				target=arr[i];
			}
		}
		
		System.out.println(" element found  " +target );
		

	}

}
