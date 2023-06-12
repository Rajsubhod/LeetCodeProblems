/*
  The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

  For example, the next permutation of arr = [1,2,3] is [1,3,2].
  Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
  While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
  Given an array of integers nums, find the next permutation of nums.

    ***** The replacement must be in place and use only constant extra memory. *****
 */

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(Arrays.toString(new NextPermutation().fun(nums)));
    }

    private int[] fun(int[] nums) {
        int breakpoint=Integer.MIN_VALUE;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breakpoint=i;
                break;
            }
        }
        if(breakpoint==Integer.MIN_VALUE){
            reverse(nums,0);
        }
        else{
            int nextLarger = -1;
            for(int i=nums.length-1;i>=breakpoint;i--){
                if (nums[i] > nums[breakpoint]) {
                    nextLarger = i;
                    break;
                }
            }
        
        swap(nums, breakpoint, nextLarger);
        reverse(nums, breakpoint + 1);
        }
        return nums;
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
