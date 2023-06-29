package SumOfDIgitsOfNumber;

public class Program2 {
    public static void main(String[] args) {
        int num=2348;
        int sum=0;
        System.out.println("Sum of the digits is "+getSum(num,sum));
    }
    static int getSum(int num,int sum){
        if(num==0)
            return sum;
        sum=sum+num%10;
        return getSum(num/10,sum);
    }
}
