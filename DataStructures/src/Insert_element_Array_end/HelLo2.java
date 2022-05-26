package Insert_element_Array_end;

public class HelLo2 {

	public int[] insertend(int arr[], int n, int x) {

		int newarr[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			newarr[i] = arr[i];
			newarr[n] = x;
		}

		return newarr;

	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int n = 6;
		int x = 50;
		HelLo2 h1 = new HelLo2();
		int arr2[] = h1.insertend(arr1, n, x);

		for (int h3 : arr2) {
			System.out.println(h3);
		}

	}

}
