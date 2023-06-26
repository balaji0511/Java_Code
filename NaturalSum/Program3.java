package NaturalSum;
//Using Recursion
//This method uses Recursion to recursively add the natural numbers up to the given integer input using Recursion in Java.
public class Program3 {
    public static void main(String[] args) {
        int n=10;
        int sum= GetSum(n);
        System.out.println(sum);
    }
    static int GetSum(int num){
        if(num==0){
            return 0;
        }
        return num+ GetSum(num-1);
    }
}
