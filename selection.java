public class selection {
    public int[] sortArray(int[] nums) {
        int size = nums.length;
        int mid_indx = 0;

        for (int i=0; i<=size-2; i++){
            mid_indx=i;
            for(int j=i+1; j<=size-1; j++){
                if(nums[mid_indx]>nums[j]){
                    mid_indx=j;
                }
            }
            if(mid_indx != i){
                int temp = nums[mid_indx];
                nums[mid_indx] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
