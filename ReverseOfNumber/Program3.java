package ReverseOfNumber;

public class Program3 {
    public static void main(String[] args) {
        int num=789;
        int rev=0;
        System.out.println("The reverse of given number is "+getReverse(num,rev));
    }
    static int getReverse(int num,int rev){
        if(num==0){
            return rev;
        }
        int rem=num%10;
        rev=rev*10+rem;
        return getReverse(num/10,rev);
    }
}
