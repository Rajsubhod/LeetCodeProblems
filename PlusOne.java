/*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.
*/

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        int[] digits2={1,2,9};
        int[] digits3={9,9,9};
        System.out.println(Arrays.toString(fun(digits)));
        System.out.println(Arrays.toString(fun(digits2)));
        System.out.println(Arrays.toString(fun(digits3)));
    }

    private static int[] fun(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        int[] res=new int[digits.length+1];
        int j=digits.length-1;
        while(j>=0 && digits[j]==9){
            digits[j]=0;
            j--;
        }
        if(j<0){
            res[0]=1;
            return res;
        }
        digits[j]+=1;       
        return digits;
    }
}
