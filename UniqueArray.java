/*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.
 */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class UniqueArray {
    public static void main(String[] args) {
        int[] arr = {1,8,6,7,5,4,8,3,7};
        int[] ans = UniqueArray.fun3(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int fun(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        int j=0;
        for(int i=0;i<arr.length;i++)
            list.add(-1);
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])==false){
                list.set(j, arr[i]);
                j++;
            }
        }
        return j;
    }
    private static int[] fun2(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num:arr)
            set.add(num);
        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
    //this method is same as the previous one but it doesn't requir extra space
    public static int[] fun3(int[] arr){
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[++i]=arr[j];
            }
        }
        return Arrays.copyOfRange(arr,0,i+1);
    }
}
    
