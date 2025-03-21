package programs;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 39, 94, 202, 908, 9734 };
		int target=202;
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				System.out.println(mid);
				break;
			}
			else if(nums[mid]<target)
				left=mid+1;
			else
				right=mid-1;
		}
	}
}
