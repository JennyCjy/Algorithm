
public class SingleNumber {
	public int solution(int[] nums){
		int result=0;
		for(int i=0;i<nums.length;i++){
			result=result^nums[i];
		}
		return result;
	}
	
	public static void main(String[] args){
		SingleNumber singleNumber = new SingleNumber();
		int[] nums={1,2,3,4,5,67,5,3,4,2,1};
		System.out.println(singleNumber.solution(nums));
		
	}
}
