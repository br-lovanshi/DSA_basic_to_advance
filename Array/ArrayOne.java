package Array;

import java.util.Arrays;

class ArrayOne{
    
    
            public  int getZero(int[] array){
    
                int ans = 0;
                for(int i = 0;i<array.length;i++){
                    if(array[i] == 0){
                        ans =  i;
                    }
                }
    
                return ans;
            }
    public static void main(String[] args) {
        
        int[] array = new int[4];

        int index = 0;

        for(int i = 1;i<2;i++){
            array[index++] = i;

        }
        // System.out.println(Arrays.toString(array));

        array[index++] = 40;

        for(int i = 0;i<array.length;i++){
            if(array[i] == 0){
                array[i] = 100;
                break;
            }
        }

        ArrayOne object = new ArrayOne();

        int getZero = object.getZero(array);
        // System.out.println(getZero);

        for(int i :array){
            // System.out.println(i);
        }


        int []array1 = {1,1,3,1,1,1,5,1,1,1,1,1,1,1,2,2,2,5};
        int answer = object.getDuplicateElementMoreOccurences(array1);
        System.out.println(answer);

    }

    public int getDuplicateElementMoreOccurences(int[] array){

        int answer = 0;
        int maxCount = 0;

        for(int i = 0;i<array.length;i++){

            int count = 0;

            for(int j = 0;j<array.length;j++){

                if(array[i] == array[j]){
                    count++;
                }
                
            }

            if(count > maxCount ){
                maxCount = count;
                answer = array[i];
            }
        }

        return answer;
    }
}