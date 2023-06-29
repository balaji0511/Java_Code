package ReverseOfNumber;

public class Program4 {
    public static void main(String[] args) {
        int num=12345;
        getReverse(num);
    }
    static void getReverse(int num){
        if(num==0)
            return;
        int rem=num%10;
        System.out.print(rem);
        getReverse(num/10);
    }
}
