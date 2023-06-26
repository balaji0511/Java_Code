package NumberSum;
//Using the Formula
//In this method we’ll use a sequence and series formula to find the sum of n numbers in a series. Formula : N*(N+1)/2.
public class Program2 {
    public static void main(String[] args) {
        int a=1;
        int b=10;
        int sum=0;
        sum= b*(b+1)/2-a*(a+1)/2+a;
        System.out.println(sum);
    }
}
