package LeetCodeBasics;
import java.lang.*;

public class Aand {
    
    public static String isTrue(String[] search, String result[]){
        String answer = "Test case failed";
            for(String i: search) {
                // System.out.println(i);
                for(String j : result){
                    // System.out.println(i + " " + j);
                 if(i == j){
                    System.out.println(i + " " + j);
                    answer = "Test case passed";
                    
                 }
                //  break;
                }
    
            }
    
            return answer;
        }
    public static void main(String[] args) {
        
        String search[] = {"aanand","brajesh","akshary","ashiwini"};
        
        String result[] = {"abc","efg","kddk","ashiwini"};

        String answer = isTrue(search,result);
        System.out.println(answer);
    }
        
    

}
