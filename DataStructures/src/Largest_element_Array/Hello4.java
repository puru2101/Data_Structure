package Largest_element_Array;

public class Hello4 {

	int highestelement(int arr[]) {
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		
		
		return max;
		
	}
	public static void main(String[] args) {
		int arr1[]= {4,3,5,7,61,2,134,0,6};
		///int n=4;
		Hello4 h1= new Hello4();
		int max1=h1.highestelement(arr1);
		
		System.out.println(max1);
		

	}

}
