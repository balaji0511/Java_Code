package PrimeNumberWIthGIvenRange;
//For the two given integer variables lower and upper, we perform the following
//Iterate through the numbers using for loop with the step size as 2.
//Check if the number has any factors in the range [3, sqrt(number)].
public class Program4{
    public static void main(String[] args) {
        int lower=50,upper=100;
        for(int i=lower;i<upper;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n<2)
            return false;
        else if (n==2)
            return true;
        else if(n%2==0)
            return false;
        for(int i=3;i<=Math.sqrt(n);i+=2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
