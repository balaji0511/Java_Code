package PositiveNegative;

//Using Nested if-else Statements
//This method uses a nested if-else Statements to check whether a given number is Positive or Negative.

public class Program2 {
    public static void main(String[] args) {
        int num=0;
        if(num>=0){
            if(num>0){
                System.out.println("positive");
            }
            else{
                System.out.println("zero");
            }
        }
        else{
            System.out.println("negative");
        }
    }
}

