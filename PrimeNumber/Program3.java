package PrimeNumber;
//optimization by break condition
//Working
//In the above mentioned we’ll divide the whole loop situation into two parts,
// we’ll check if the number is lesser than 2, it’s not a prime. It also mustn’t have factors between range [2, num-1]
public class Program3 {
    public static void main(String[] args) {
        int n=47;
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        else{
            for (int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        String result=isPrime? "It is prime":"It is not prime";
        System.out.println(result);
    }
}
