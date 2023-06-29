package Palindrome;

public class Program1 {
    public static void main(String[] args) {
        int num=14341,reverse=0,rem,temp;

        temp=num;
        while(temp!=0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }
        System.out.println(reverse);
        if(num==reverse){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
