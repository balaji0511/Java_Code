package ReverseOfNumber;

public class Program2 {
    public static void main(String[] args) {
        int num=456;
        int reverse=0;
        int rem;
        for(;num!=0;num=num/10){
            rem=num%10;
            reverse=reverse*10+rem;
        }
        System.out.println("the reverse of a number is "+reverse);
    }
}
