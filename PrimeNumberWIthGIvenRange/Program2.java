package PrimeNumberWIthGIvenRange;
//For a given two integers lower and upper we perform the following
//We iterate through the numbers using for loop.
//We check whether or not the number has a factor within the range [2, number/2].
public class Program2{
    public static void main(String[] args) {
        int lower=1,upper=40;
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
            for(int i=2;i<=n/2;i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}
