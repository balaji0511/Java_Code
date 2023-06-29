package Palindrome;

public class Program2 {
    public static void main(String[] args) {
        int num=12321,reverse=0;
        System.out.println(isReverse(num,reverse));
        if(num==isReverse(num,reverse)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    static int isReverse(int num,int reverse){
        if(num==0)
            return reverse;
        int rem=num%10;
        reverse=reverse*10+rem;
        return  isReverse(num/10,reverse);
    }
}
