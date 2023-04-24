public class ClimbingStairs {
    
    public static void main(String[] args) {
        
        int number = 10;

        ClimbingStairs object = new ClimbingStairs();

        System.out.println(object.ClimbingStairsSolve(number));
    }
    public int ClimbingStairsSolve(int n){

        if(n == 1) return n;
        if(n == 2) return n;

        int array [] = new int[n];
        array[0] = 1;
        array[1] = 2;

        for(int i = 0;i<n;i++){
            array[i] = array[i-1] + array[i-2];

        }

        return array[n-1];
    }
}
