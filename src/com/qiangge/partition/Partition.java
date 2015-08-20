package com.qiangge.partition;

public class Partition {
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

	public int partition1(int[] array, int start, int end) {
		int partition = -1;
		if (array != null && start >= 0 && end >= 0) {
			int index=start;
			
		}
	}

	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
