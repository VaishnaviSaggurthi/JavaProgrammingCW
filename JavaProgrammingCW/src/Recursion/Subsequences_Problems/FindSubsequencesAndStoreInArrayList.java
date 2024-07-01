package Recursion.Subsequences_Problems;

import java.util.*;

public class FindSubsequencesAndStoreInArrayList {
    /*
    s={"abc"}
     */
    static ArrayList<String> subsequences(String s){
        ArrayList<String> ans = new ArrayList<>();
        // Base Case
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char currAns = s.charAt(0); // a
        ArrayList<String> smallAns = subsequences(s.substring(1)); // ["bc","b","c",""]
        // smallAns= ["bc","b","c",""]
        for(String s1 : smallAns){
            ans.add(s1); // bc
            ans.add(currAns+s1); // abc
        }
        // ans=["bc","abc","b","ab","c","ac","","a"]
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        System.out.println(subsequences(s));
    }
}
