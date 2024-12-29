public class SelectionSort {
    public static void main(String[] args) {
        int[] nums ={64, 25, 12, 22, 11};
        System.out.print("Initial Sequence : ");
                    for(int m = 0; m<nums.length;m++){
                        System.out.print(" "+ nums[m]);
                    }
        for(int i = 0; i<nums.length;i++){
            int min = i;
            int minval = nums[i];
            for(int k=i+1;k<nums.length;k++){
                if(nums[k]<minval){
                    min = k;
                    minval = nums[k];
                    System.out.println("\nValue of K="+ k + " Min updated "+ nums[min]);
                    for(int m = 0; m<nums.length;m++){
                        System.out.print(" "+ nums[m]);
                    }
                }else{
                    System.out.println("\nNothing Happened of K="+ k + " Min = "+ nums[min]);
                }
            }
            
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
            
            System.out.println("\nAfter outer loop swap"+ i);
                    for(int m = 0; m<nums.length;m++){
                        System.out.print(" "+ nums[m]);
                    }
        }
        System.out.print("Fianal array ");
        for(int i = 0; i<nums.length;i++){
            System.out.print(" "+ nums[i]);
        }
    }
}
