/*
  Given a integer of int32 return the reverse and if the reverse excide the int32 range then return 0
 */
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(new ReverseInteger().reverse(1534236469));
    }
    public int reverse(int x) {
        long num=0;
        while(x!=0){
            int d = x%10;
            if(x<0){
                num=num*10-d;
            }
            else{
                num=num*10+d;
            }
            x=x/10;
        }
        if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
            return 0;
        }
        return (int)num;
    }
}
