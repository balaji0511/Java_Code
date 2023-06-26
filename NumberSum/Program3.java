package NumberSum;
//Using Recursion
//In this method we’ll use recursion to iterate through and sum up all the numbers that lay in the given interval.
public class Program3 {
    public static void main(String[] args) {
        int a=1;
        int b=10;
        int sum=GetValue(0,a,b);
        System.out.println(sum);
    }
    static int GetValue(int sum,int i,int j){
        if (i>j){
            return sum;
        }
        return sum+GetValue(sum,i+1,j);
    }
}
