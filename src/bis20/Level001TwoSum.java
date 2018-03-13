package bis20;

/*
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	
*/
public class Level001TwoSum {

	private static int[] intArray = { 3, 2, 4 };

	public static void main(String[] args) {
		intArray = twoSum(intArray, 6);
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int a = 0; a < nums.length; a++) {
			for (int b = a+1; b < nums.length; b++) {
				if (nums[a] + nums[b] == target) {
					return new int[] { a, b };
				}
			}
		}
		return null;
	}
}
