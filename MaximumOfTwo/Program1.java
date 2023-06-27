package MaximumOfTwo;
//Using if-else Statements
//In this method we’ll use if-else statements to compare the two numbers and two numbers and print out the greatest.
public class Program1 {
    public static void main(String[] args) {
        int a=50;
        int b=10;
        if(a==b){
            System.out.println(a+" and "+b+"are equal");
        }
        else if(a>b) {
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
