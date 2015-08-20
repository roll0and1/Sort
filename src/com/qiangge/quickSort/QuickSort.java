package com.qiangge.quickSort;

public class QuickSort {
	public int partition(int[] array, int start, int end) {
		int partition = -1;
		if (array != null && start >= 0 && end >= 0) {
			int index = array[start];
			int left = start;
			int right = end + 1;
			while (true) {
				// left的范围是0到倒数第二位 若left=end ++left会越界
				while (left < end && array[++left] < index)
					;
				// right向左运动到left处会停止 因start是枢值

				while (array[--right] > index)
					;
				if (left < right) {
					swap(array, left, right);
				} else {
					break;
				}

			}
			swap(array, start, right);
			partition = right;

		}
		return partition;
	}

	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public void quickSort(int[] array, int start, int end) {
		if (start >= end) {
			return;
		} else {
			int partition = partition(array, start, end);
			quickSort(array, start, partition - 1);
			quickSort(array, partition + 1, end);
		}
	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] array = { 10, 5, 2, 5, 9, 3, 1, 7 };
		int start = 0;
		int end = array.length - 1;
		quickSort.quickSort(array, start, end);
		for (int x : array) {
			System.out.print(x + ";");
		}

	}
}
