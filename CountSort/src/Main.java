//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] nums = {2,3,5,2,6,3,6,1,0,4,2,3,5,5,7,6,4,3};
       countSort(nums);
       printArray(nums);

    }

    public static  void printArray(int []nums){
        for(int num :nums){
            System.out.println(num);
        }
    }

    public static void countSort(int [] nums){
        int max = 0;
        for(int num : nums){
            if(max<num){
                max = num;
            }
        }
        int []freq = new int[max +1];

        for(int i = 0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        //now i have to do in place array changes
        int k =0;

        for (int i = 0; i <freq.length ; i++) {
            for(int j =0; j<freq[i]; j++){
                nums[k++] = i;
            }
        }


    }
}