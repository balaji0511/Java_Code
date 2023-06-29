package PrimeNumber;
//If the number is lesser than 2.
//If the number has any factors other than 1 and the number itself in the given range of [3, sqrt(number)].
//We skip one iteration until the last element in reached.
//If either of the above conditions are satisfied, then the number is not a Prime.
public class Program4 {
    public static void main(String[] args) {
        int n=7;
        if(isPrime(n)){
            System.out.println(n+ " is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else if(n==2){
            return true;
        } else if (n%2==0) {
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
           if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
