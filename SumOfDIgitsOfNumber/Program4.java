package SumOfDIgitsOfNumber;

public class Program4 {
    public static void main(String[] args) {
        String num="12345";
        System.out.println("The sum of digits is "+getSum(num));
    }
    static int getSum(String num){
        int sum=0;
        for(int i=0;i<num.length();i++){
            sum=sum+num.charAt(i)-48;
        }
        return sum;
    }
}
