
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
	 * ���������ֱ𱣴�����Ƹ���λ�ϳ���1��һ�Σ����κ����εĸ���
	 * one=1��ʾ1����1��
	 * two=1��ʾ1����2��
	 * three=1��ʾ1����3��
	 * һ��three=1,one two��Ҫ����
	 * ����one�������������г���һ�ε�Ԫ��
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
