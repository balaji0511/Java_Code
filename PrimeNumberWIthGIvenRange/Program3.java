package PrimeNumberWIthGIvenRange;
//For the two given integer variables lower and upper we perform the following
//We iterate through the numbers using a for loop.
//We check whether or not the number has factors in the interval [2, sqrt(number)].
public class Program3{
    public static void main(String[] args) {
        int lower=0,upper=50;
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
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}
