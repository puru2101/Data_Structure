package Insert_element_Array;

public class Hello1 {

	int[] insertarray(int arr[], int x, int n, int pos) {

		// int index = pos - 1;
		int newarr[] = new int[n + 1];
		for (int i = 0; i  <arr.length; i++) {
			if (i < pos - 1) {
				newarr[i] = arr[i];
				
			}
			else if (i == pos - 1) {
				newarr[i+1]=arr[i];
				newarr[i] = x;
				
				
			}
			else if (i > pos - 1) {
				newarr[i+1] = arr[i];
			}
		}

		return newarr;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int x = 20;
		int pos = 3;
		int n = 7;

		Hello1 h1 = new Hello1();
		int arr1[] = h1.insertarray(arr, x, n, pos);
		for (int a1 : arr1) {
			System.out.println(a1);
		}

	}

}
