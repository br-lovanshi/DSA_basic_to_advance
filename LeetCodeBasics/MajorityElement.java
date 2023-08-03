package LeetCodeBasics;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent.AccessibleJComponent;

public class MajorityElement {
    
    public int MajorityElementSoluction(int[] nums){
        int ans = 0;
        int halfLength = nums.length / 2;

        for(int i = 0;i<nums.length;i++){

            int count = 0;

            for(int j = 1;j<nums.length;j++){

                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > halfLength){
                return nums[i];
            }
        }

        return ans;
    }

    public int hashMapSoluction(int[] nums){

        int majorityElement = 0;

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }

            if(map.get(i) > nums.length/2){
                majorityElement = i;
                break;
            }
        }
        return majorityElement;
    }
    public static void main(String[] args) {
        
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        // for(int i : array){
        //     System.out.println(i);
        // }
        // System.out.println(array.toString());

        MajorityElement bruteForce = new MajorityElement();
        System.out.println(bruteForce.MajorityElementSoluction(array));
        
       int hashmap = bruteForce.hashMapSoluction(array);
       System.out.println(hashmap);
    }
}
