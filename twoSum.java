class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = {0,0};  
        for(int i =0;i < nums.length;i++){
            for(int j =i+1; j < nums.length; j++){

                if(nums[i]+nums[j] == target){
                  arr[0] = nums[i];
		  arr[1] = nums[j];
		  break;
                }
            }

        }

	return arr;
        
    }
    public static void main(String args[]){
	
	    int arr[] = {2,7,11,15};
	    System.out.println(twoSum(arr, 9));
    }
}
