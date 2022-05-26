package Delete_element_Array;



public class Hello {
	
	int[] deletearray(int arr[],int n,int x) {
		
		int newarr[] = new int[n-1];
		
		for(int i=0;i<n;i++) {
			if(arr[i]<arr[x]) {
				newarr[i]=arr[i];
				
			}
			else if(arr[i]==arr[x]){
				continue;
				
			}
			else if(arr[i]>arr[x]) {
				newarr[i-1]=arr[i];
			}
		}
		
		
		return newarr;
		
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6,7 };
		int n = 7;
		int x = 3;
	//	int pos=
		Hello h1 = new Hello();
		int arr2[] = h1.deletearray(arr1, n, x);

		for (int h3 : arr2) {
			System.out.println(h3);
		}
	}

}
