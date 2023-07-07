/*
  Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

  You must not use any built-in exponent function or operator.

  For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */
public class SqrtX {
    public static void main(String[] args) {
        int x = 24;
        System.out.println(new SqrtX().mySqrt(x));
    }
    //Time Complexity --- O(logn)
    public int mySqrt(int x) {
        int low = 0, high = x;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            long val = (long) mid*mid;
            if(val==x){
                return (int) mid;
            }
            else if(val>x) {
                high = mid-1;
            }
            else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
