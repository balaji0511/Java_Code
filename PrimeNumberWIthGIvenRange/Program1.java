package PrimeNumberWIthGIvenRange;
//two integer variables lower and higher we perform the following
//We run a loop  to iterate through the number in the given interval.
//We check if the number is a prime by checking for factors within the range.
public class Program1 {
    public static void main(String[] args) {
        int lower=1,upper=20;
        for(int i=lower;i<upper;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n<2)
            return false;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}
