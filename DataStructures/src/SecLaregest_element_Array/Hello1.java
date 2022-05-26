package SecLaregest_element_Array;

public class Hello1 {
	
	


		int secondhighestelement(int arr[]) {
			int max=0;
			int secmax=0;
			
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) {
					
				secmax=max;
					max=arr[i];
//				}
//				if(arr[i]<max && arr[i]>secmax) {
//					
//					secmax=arr[i];
					
//					if(arr[i]<max&&arr[i]<secmax) {
//						continue;
//					}
					
						//&& arr[i]<secmax) {
					
				}
				
			}
			
			
			return secmax;
			
		}
		public static void main(String[] args) {
			int arr1[]= {4,3,5,7,61,2,134,0,6,233,455};
			///int n=4;
			Hello1 h1= new Hello1();
			int secmax1=h1.secondhighestelement(arr1);
			
			System.out.println(secmax1);
			

		}

	}


