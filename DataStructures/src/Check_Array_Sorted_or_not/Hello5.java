package Check_Array_Sorted_or_not;

public class Hello5 {

	void CheckArray(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				continue;
			}
			// break;
		}
		System.out.println("sorted");

	}

	public static void main(String[] args) {
		int arr1[] = { 4, 3, 5, 7, 61, 2, 134, 0, 6, 233, 455 };
		/// int n=4;
		Hello5 h1 = new Hello5();
		h1.CheckArray(arr1);

	}

}
