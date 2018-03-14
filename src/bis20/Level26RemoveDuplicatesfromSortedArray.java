package bis20;

import java.util.Set;
import java.util.TreeSet;

public class Level26RemoveDuplicatesfromSortedArray {

	/*
	 * Given a sorted array, remove the duplicates in-place such that each
	 * element appear only once and return the new length.
	 *
	 * Do not allocate extra space for another array, you must do this by
	 * modifying the input array in-place with O(1) extra memory.
	 *
	 * Example:
	 *
	 * Given nums = [1,1,2],
	 *
	 * Your function should return length = 2, with the first two elements of
	 * nums being 1 and 2 respectively. It doesn't matter what you leave beyond
	 * the new length.
	 */

	public static void main(String[] args) {
		int[] nums = { 1 };

		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int i = 0;
		for (int a = 0; a < nums.length; a++) {
			if (i == 0) {
				nums[i] = nums[a];
				i++;
			} else if (nums[i - 1] != nums[a]) {
				nums[i] = nums[a];
				i++;
			}
		}
		return i;
	}
}
