public class No485 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int flag = 0;
        int result = 0;
        for(int i = 0; i < len; ++i){
            if(i == len - 1 && nums[i] == 1){
                flag++;
                if(result < flag)
                    result = flag;
                break;
            }
            if(nums[i] == 1){
                flag++;
            }else{
                if(flag > result){
                    result = flag;
                }
                flag = 0;
            }
        }
        return result;
    }
}
