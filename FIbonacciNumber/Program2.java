package FIbonacciNumber;

public class Program2 {
    public static void main(String[] args) {
        int n=15;
        fib(n);
    }
    static void fib(int n){
        int fi[]=new int[n];
        fi[0]=0;
        fi[1]=1;

        System.out.print(fi[0]+" "+fi[1]+" ");
        for(int i=2;i<n;i++){
            fi[i]=fi[i-1]+fi[i-2];
            System.out.print(fi[i]+" ");
        }


    }
}
