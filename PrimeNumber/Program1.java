package PrimeNumber;
//Simple iterative solution
//Working
//In this method, we’ll iterate through all the numbers that lay in the interval [1, number]
// and check if any of them is a factor of the number, if so it’s not a Prime.
public class Program1 {
    public static void main(String[] args) {
        int n=17;
        IsPrime(n);
    }
    static void IsPrime(int n){
        int count=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count>2){
            System.out.println("not a Prime number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
