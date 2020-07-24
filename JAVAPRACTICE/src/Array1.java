
public class Array1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,5,9,56,1};
		int val=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>val) {
				val=arr[i];
			}
			
		}

		System.out.println(val);
	}

}
