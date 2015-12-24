public class MaxMin {
    public static void main(String args[]) {
        int nums[] = { 5, 1, 3, 3,4,-10};
        int min, max;

        max = 0;
        min = 0;

        for (int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }else if (min > nums[i])
                min = nums[i];
            }

        System.out.println( min + " " + max);


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                nums[i] = max;
            } else if (nums[i] == max){
                nums[i] = min;
            }

        }


        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");

        }
     }
    }

