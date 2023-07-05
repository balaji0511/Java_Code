package FIbonacciNumber;

public class Program3 {
    public static void main(String[] args) {
      int n=10;
      int fib=fibonacci(n);
        System.out.println(n+"th term of fibonacci number is "+fib);
    }
    static int fibonacci(int n){
        int a=0,b=1;
        if(n==0){
            return a;
        }
        else if(n==1){
            return b;
        }
        else if(n==2){
            return a+b;
        }
        else{
            for(int i=3;i<=n;i++){
               int temp=a+b;
               a=b;
               b=temp;
            }
            return b;

        }
    }

}
