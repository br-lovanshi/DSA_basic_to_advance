package Array;
// import java.util.*;uh j,.
import java.util.Arrays;

public class Arrays1 {
    public int fineMax(int[] arr){
        int answer = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > answer){
                answer= arr[i];
            }
            
        }
        return answer;
    }
    
    public int findMin(int[] arr){
        int answer = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < answer){
                answer = arr[i];
            }
        }
        return answer;

    }
    public static void main(String[] args) {

        
        
        int[] arr1 = new int[4];
        // array1[1] = 10;
        String[] array2 = {"one","two","three"};
        char[] array3 = {'a','b','e'};
        int value1 = 0;
        String str = null;
        int[][] matrix = new int[3][4]; 
        Arrays1 object = new Arrays1();


        
        int array[] = {-34,-10, -56, -9, -33};
        System.out.println(object.fineMax(array));
        System.out.println(object  );
        // Arrays.stream(array).forEach(System.out::println);
        //returns string representation of the specified array  
        // System.out.println(Arrays.toString(array));  
        // System.out.println(Arrays.deepToString(matrix));

        for(int i = 0;i<array2.length;i++){
            // System.out.println(array2[i]);
            String arrayValue = array2[i];
            for(int j = 0;j<arrayValue.length();j++){
                // System.out.print(arrayValue.charAt(j) == array3[i]);
            }
            // System.out.println();
        }

       int maxValue =  Math.max(20,40);
       int minValue = Math.min(maxValue,9);
    //    System.out.println();
    }
}
