package LeetCodeBasics;

import java.util.Arrays;
import java.util.List;

class ArrayList {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("hello","ABC","defgh");

        String str[] = {"abc","kdaf","defgh","hello","defdfk"};

        for(int i = 0;i<str.length;i++){
            // System.out.println(str[i].contains("hello"));
            if(str[i].contains("hello")){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILDED");
            }
        }
    }
}