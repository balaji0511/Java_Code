package SumOfDIgitsOfNumber;
//our objective is to break down the number into it’s individual digits and sum them up together.
//Modulo Operator % : We’ll use this to extract the digits from the number.
//Divide Operator / : We’ll use it to shorten the number by 1 digit.
public class Program1 {
    public static void main(String[] args) {
        int num=123;
        int sum=0;

        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("The sum of digits of number is "+ sum);
    }
}
