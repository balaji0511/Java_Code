package NaturalSum;
//Using for Loop
//In this method we’ll add all the natural numbers until the given integer input using for loop in Java.
public class Program1 {
    public static void main(String[] args) {
        int n=15;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
