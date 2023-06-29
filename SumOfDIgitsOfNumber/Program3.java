package SumOfDIgitsOfNumber;

public class Program3 {
    public static void main(String[] args) {
        int num=76349;
        System.out.println("The sum of digits is "+getSum(num));
    }
    static int getSum(int num){
        if(num==0)
            return 0;
        return num%10+getSum(num/10);
    }
}
