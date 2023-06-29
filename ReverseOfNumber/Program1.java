package ReverseOfNumber;

public class Program1 {
    public static void main(String[] args) {
        int num=2345;
        int reverse=0;
        int rem;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("reverse of a number is "+reverse);
    }
}
