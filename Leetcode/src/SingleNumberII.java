
public class SingleNumberII {
	public int solution(int[] nums){
		int bitNum[] = new int[32];
		int result=0;
		for(int i=0;i<bitNum.length;i++){
			for(int j=0;j<nums.length;j++){
				bitNum[i]+=(nums[j]>>i)&1;
			}
			result+=(bitNum[i]%3)<<i;
			
		}
		return result;
		
	}
	/**
	 * 三个变量分别保存二进制各个位上出现1的一次，两次和三次的个数
	 * one=1表示1出现1次
	 * two=1表示1出现2次
	 * three=1表示1出现3次
	 * 一旦three=1,one two就要清零
	 * 最终one就是整个数组中出现一次的元素
	 * @param nums
	 * @return
	 */
	public int solution2(int[] nums){
		int one=0, two=0, three=0;  
        for(int i=0; i<nums.length; i++){  
            two |= one&nums[i];  
            one^=nums[i];  
            three=one&two;  
            one&= ~three;  
            two&= ~three;  
        }  
        return one;  
	}
	public static void main(String[] args) {
		SingleNumberII singleNumberII = new SingleNumberII();
		int nums[]={1,2,3,3,2,1,2,3,1,5,5,6,5};
				System.out.println(singleNumberII.solution2(nums));
	}
}
