package MaximumOfTwo;
//Using Ternary Operator
//In this method we’ll use the Ternary Operator and compare the two numbers to check for the greatest among them.
public class Program2 {
    public static void main(String[] args) {
        int a=70,b=50,temp;
        if(a==b){
            System.out.println("Both are equal");
        }
        else{
            temp= a>b? a:b;
            System.out.println(temp+" is maximum");
        }
    }
}
