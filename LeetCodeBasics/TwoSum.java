
class Main{

    public int[] twoSum(int nums[], int target){

        int[] ans  = new int[2];

        for(int i = 0;i<nums.length;i++){
            
            int sumOne = nums[i];

            for(int j = 0;j<nums.length;j++){
                
                if(sumOne + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }

public static void main(String[] args) {
    // System.out.println("hello world!");
    int[] twoSumAns = {4,2,4,6,5,3,6};
    int target = 4;
    Main mainClass = new Main();

    System.out.println(mainClass.twoSum(twoSumAns,target));
}
}