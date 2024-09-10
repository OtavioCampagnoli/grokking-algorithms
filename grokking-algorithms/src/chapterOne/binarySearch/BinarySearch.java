package chapterOne.binarySearch;

public class BinarySearch {

	public static int binarySearch(int[] list, int item) {
		int low = 0;
		int high = list.length - 1;

		while (low <= high) {
			int middle = low + (high - low) / 2;

			if (list[middle] == item) {
				return middle;
			}

			if (list[middle] > item) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] list = { 5, 10, 20, 30, 40, 50 };
		int item = 10;

		int result = binarySearch(list, item);

		if (result != -1) {
			System.out.println("Elemento encontrado na posição: " + result);
		} else {
			System.out.println("Elemento não encontrado.");
		}

	}
}
