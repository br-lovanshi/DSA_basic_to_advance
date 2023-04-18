package  LeetCodeBasics;

public class PalindromeInteger {
    
    public boolean isPalindrome(int num){

        String str = Integer.toString(num);

        int length = str.length()/2;

        for(int i = 0;i<length;i++){

            if(str.charAt(i) != str.charAt(length-i-1))
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        PalindromeInteger object =  new PalindromeInteger();

        boolean answer = object.isPalindrome(1211);
        System.out.println(answer);
    }
}
