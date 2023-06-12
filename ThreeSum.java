/*
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    Notice that the solution set must not contain duplicate triplets.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,-1,-4};
        System.out.println(fun(arr));

    }

    private static List<List<Integer>> fun(int[] nums) {
        int i=0,j=0,k=0;
        List<List<Integer>> list = new ArrayList<>();
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                for(k=j+1;k<nums.length;k++){
                    if((i!=j && i!=k && j!=k) && (nums[i]+nums[j]+nums[k])==0){
                        list.add(List.of(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return list;
    }
}
