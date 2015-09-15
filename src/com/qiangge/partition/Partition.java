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
				// right向左运动到left处会停止 因为start是枢值

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
			int pivot = array[start];
			int small = start;
			for (int i = start + 1; i <= end; i++) {
				if (array[i] < pivot) {
					small++;
					if (small != i) {// 若当前遍历元素坐标与small不相等则交换位置
						swap(array, small, i);
					}
				}
			}
			swap(array, small, start);
			partition = small;
		}
		return partition;
	}

	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {
		Partition partition = new Partition();

		int[] array = { 4, 5, 10, 3 };
		int x = partition.partition(array, 0, array.length - 1);
		int[] array1 = { 4, 5, 10, 3 };
		int y = partition.partition1(array1, 0, array1.length - 1);
		System.out.println(x);
		System.out.println(y);

	}
}
