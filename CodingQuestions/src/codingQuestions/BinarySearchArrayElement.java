package codingQuestions;

public class BinarySearchArrayElement {

	public static void main(String[] args) {
		//array shoud be sorted  
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
	
		int target =70;
		
		boolean flag = false ;
		
		int l =0;
		int h=a.length-1;
		
		while(l<=h) {
			
			int m=(l+h)/2;
		   	
			if(m==target) {
				
				System.out.println("element found" +target);
				flag =true;
				break;
			}
			
			if(target>m) {
				
				
				l=m+1;
			}
			
			if(target<m) {
				
				h=m-1;
			}
			
		}
		
		if(flag==false) {
			
			System.out.println("key not found");
		}
		
	}

}
