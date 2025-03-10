class Solution {
    //tc-o(n)
    //sc-o(1)
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int i = n-2;
       // step1. find the breach
        while(i>=0 && nums[i] >= nums[i+1])
        {
          i--;
        }
        //step2. find the digit to be swapped with
        if(i != -1)
        {
        int j=n-1;
        while(nums[i] >= nums[j])
        {
         j--;
        }
        swap(nums, i,j);
        
        }
        //3.reverse from i+1
        reverse(nums, i+1,n-1);
        
    }
    private void reverse(int[] nums, int l,int r)
    {
        while(l<r)
        {
            swap(nums,l,r);
            l++;
            r--;
        }

    }
    private void swap(int[] nums, int i,int j )
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    /*
    private void swap(int[] nums,int i,int j)
    {
        //[2,4,7,8,4] [2,12,7,8,4] [2,12,7,4,4] [2,8,7,4,4]
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        int[i] = nums[i] - nums[j];

    }
     */
}