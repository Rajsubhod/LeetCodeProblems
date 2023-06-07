/*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.
 */

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,8,6,7,5,4,8,3,7};
        int num=7;
        int[] ans = RemoveElement.fun(arr,num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] fun(int[] arr,int key) {
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=key){
                arr[i++]=arr[j];
            }
        }
        return Arrays.copyOfRange(arr,0,i+1);
    }
}
