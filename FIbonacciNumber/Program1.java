package FIbonacciNumber;

public class Program1 {
    public static void main(String[] args) {
        int a=0,b=1,temp;
        int num=10;
        System.out.println("Fibonacci series is");
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=num;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp+" ");
        }

    }
}
