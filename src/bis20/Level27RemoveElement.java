package bis20;

public class Level27RemoveElement {

	/*
	 * Given an array and a value, remove all instances of that value in-place and
	 * return the new length.
	 *
	 * Do not allocate extra space for another array, you must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 *
	 * The order of elements can be changed. It doesn't matter what you leave beyond
	 * the new length.
	 *
	 * Example:
	 *
	 * Given nums = [3,2,2,3], val = 3,
	 *
	 * Your function should return length = 2, with the first two elements of nums
	 * being 2.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 2, 3 };

		System.out.println(removeElement(nums, 2));
	}

	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			if (nums[0] == val) {
				return 0;
			} else {
				return 1;
			}
		}

		int i = 0;
		boolean last = false;
		for (int a = 0; a < nums.length; a++) {
			if (nums.length == a + 1) {
				last = true;
			}

			if (nums[a] == val) {
				if (a + 1 < nums.length) {
					nums[a] = nums[a + 1];
					i++;
				} else if(nums[a] == val) {
					i++;
				}

				for (int b = a; b < nums.length; b++) {
					// System.out.println(nums[b]);
					if (b + 1 < nums.length) {
						if (!last) {
							nums[b] = nums[b + 1];
						}
					} 
				}
			}
		}
		return nums.length - i;
	}
}
