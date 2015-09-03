package edu.nju.cjy.arrays;

public class MaxSum {
	public int getMaxSum(int[] nums){
		int max=nums[0];
		int result=0;
		for (int i = 0; i < nums.length; i++) {
			result=Math.max(result+nums[i], nums[i]);
			System.out.println(i+":"+result);
			max=Math.max(result, max);
		}
		return max;
	}
	
	public static void main(String[] args) {
		MaxSum maxSum = new MaxSum();
		int[] nums={1,2,3,-1,-20,100,34,-10 };
		System.out.println(maxSum.getMaxSum(nums));
		
	}
}
