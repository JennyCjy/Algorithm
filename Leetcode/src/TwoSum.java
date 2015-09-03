import java.util.HashMap;

public class TwoSum {
	/**
	 * @param nums
	 * @param target
	 * @return
	 */
//	public int[] twoSum(int[] nums, int target){
//		int [] result =  new int[2];
//		boolean flag=false;
//		for (int i=0;i<nums.length;i++){
//			for(int j=i+1;j<nums.length;j++){
//				if(nums[j]==(target-nums[i])){
//					flag=true;
//					result[0]=i+1;
//					result[1]=j+1;
//					return result;
//				}
//			}
//		}
//		return null;
//	}
	
	public int[] twoSum(int[] nums,int target){
		HashMap<Integer,Integer> map = new HashMap<>();
		int[] result=new int[2];
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			Integer secNum= map.get(target-nums[i]);
			if(secNum!=null&&secNum!=i){
				result[0]=i+1;
				result[1]=secNum+1;
				return result;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int nums[] = {2,7,11,15,34,1,3,5};
		TwoSum twoSum = new TwoSum();
		long startTime = System.nanoTime();
		int result[]=twoSum.twoSum(nums,8);
		long endTime = System.nanoTime();
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println("Time:"+(endTime-startTime)+" ns");
	}
}
