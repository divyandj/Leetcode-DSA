public class LeetCode75Sort {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
            boolean swap = false;
            for(int k=0; k<nums.length-i-1;k++){
                if(nums[k]>nums[k+1]){
                    int temp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = temp;
                    swap = true;
                }
        }
         System.out.println("\nAfter swap count"+i);
          System.out.println("NEW ARray after"+i);
                for(int m=0; m<nums.length; m++){
                System.out.print(" "+nums[m]);
            }
        if(swap==true){
            swap = false;
        }else{
            break;
        }
        }
    }
}
