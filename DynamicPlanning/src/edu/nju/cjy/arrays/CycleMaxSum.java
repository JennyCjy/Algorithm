package edu.nju.cjy.arrays;

public class CycleMaxSum {
	public int getMaxSum(int[] nums){
		int max=nums[0];
		int min=nums[0];
		int resultMax=0;
		int resultMin=0;
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			resultMax=Math.max(resultMax+nums[i], nums[i]);
			max=resultMax>max?resultMax:max;
			resultMin=Math.min(resultMin+nums[i], nums[i]);
			min=Math.min(min, resultMin);
		}
		System.out.println(sum);
		System.out.println(resultMin);
		int cycleMax= sum-min;
		System.out.println(max+":"+cycleMax);
		return Math.max(max, cycleMax);
	}
	public static void main(String[] args) {
		CycleMaxSum cycleMaxSum= new CycleMaxSum();
		int[] nums={1,2,3,-1,-20,100,34};
		System.out.println(cycleMaxSum.getMaxSum(nums));
	}
}