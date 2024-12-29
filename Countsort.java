public class Countsort {
    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 0, 2, 3, 0, 3};
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int[] freqarr = new int[max+1];
        for(int i=0;i<nums.length;i++){
            freqarr[nums[i]]++;
        }
        
        for(int i=1;i<freqarr.length;i++){
            freqarr[i] = freqarr[i-1]+freqarr[i];
        }
        
        
        System.out.println("Freq cumulative: ");

        for(int i=0;i<freqarr.length;i++){
            System.out.print(freqarr[i]);
        }
        int[] output = new int[nums.length];
    
        for(int i = 0; i<nums.length;i++){
            output[freqarr[nums[i]]-1] = nums[i];
            freqarr[nums[i]]--;
        }
          System.out.println("\noutput: ");

        for(int i=0;i<output.length;i++){
            System.out.print(output[i]);
        }
    }
}
