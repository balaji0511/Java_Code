package EvenOdd;
//Using Ternary Operator
//This Method uses the ternary operator to check if the integer input is divisible by 2, If true print Even or Odd otherwise.
public class Program2 {
    public static void main(String[] args) {
        int num=45;
        String result=num%2==0? "even": "odd";
        System.out.println(result);
    }
}
