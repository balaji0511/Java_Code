package PositiveNegative;
//Using Ternary Operator
//This method uses a ternary operator to check whether a number is Positive or Negative.

public class Program3 {
    public static void main(String[] args) {
        int num=-50;
        if(num==0){
            System.out.println("zero");
        }
        else{
            String result=num>0? "positive":"negative";
            System.out.println(result);
        }
    }
}

