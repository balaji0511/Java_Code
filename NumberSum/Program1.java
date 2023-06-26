package NumberSum;
//Using Brute Force
//In this method we’ll use loops to iterate through from the base interval to the upper interval meanwhile adding all the numbers to the sum variable.
public class Program1 {
    public static void main(String[] args) {
        int a=1;
        int b=10;
        int sum=0;
        for(int i=a;i<=b;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
