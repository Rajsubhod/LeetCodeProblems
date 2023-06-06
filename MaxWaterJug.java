/* 
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
*/

import java.util.Random;

public class MaxWaterJug {
    public static void main(String[] args) {
        
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int[] arr2 = {1,1};
        final int[] arr3 = createLargeArray(9000);
        MaxWaterJug jug = new MaxWaterJug();
        int ans = jug.fun(arr3);
        int ans2 = jug.maxArea(arr3);
        System.out.println(ans+" --- "+ans2);

    }

    private static int[] createLargeArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }

        return arr;
    }

    public int fun(int[] height) {
        int areaMax=0;
        for(int i=0;i<height.length;i++){
            for(int j=i;j<height.length;j++){
                int area = (j-i)*Integer.min(height[i],height[j]);
                if(area>areaMax){
                    areaMax = area;
                }
            }
        }
        return areaMax;
    }

    // the above method is good but brute force is only usable when array size is small
    // thus we use two pointer method which reduces the time complexity
    public int maxArea(int[] height) {
        int areaMax=0;
        int i=0,j=height.length-1;
        while(i<=j){
            int area = (j-i)*Integer.min(height[i],height[j]);
            areaMax = Math.max(areaMax, area);
            if(height[i]==height[j]){
                i++;
                j--;
            }
            else if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return areaMax;
    }
}
