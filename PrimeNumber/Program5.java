package PrimeNumber;
//Define a recursive function with base case as follows
//If number == iter, return True.
//If number%iter == 0, return False.
//If a number<2, return False.
//Set recursive step call as checkPrime(number, iter+1).
public class Program5 {
    public static void main(String[] args) {
        int i = 2;
        int n = 53;
        boolean isPrime = true;
        isPrime = CheckPrime(n, i);
        if (isPrime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");
    }

    static boolean CheckPrime(int n,int i){
        if(n<i){
            return false;
        }
        if(n==i){
            return true;
        }
        if (n%i==0) {
            return false;
        }
        i+=1;
        return CheckPrime(n,i);

    }
}