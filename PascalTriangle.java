/*
   Given an integer numRows, return the first numRows of Pascal's triangle.

   In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */

import java.util.List;

public class PascalTriangle{
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    private static List<List<Integer>>fun(int n) {
        if(n==1){
            return List.of(List.of(1));
        }
        if(n==2){
            return List.of(List.of(1),List.of(1,1));
        }
        
        return null;
    }
}