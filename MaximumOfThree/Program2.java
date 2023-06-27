package MaximumOfThree;
//Using Ternary Operator
//In this method we use the knowledge of Ternary Operators in Java.
public class Program2 {
    public static void main(String[] args) {
        int a=40,b=80,c=45;
        int max,temp;
        temp=a>b?a:b;
        max=temp>c?temp:c;
        System.out.println(max+" is maximum");
    }
}
