package MaximumOfThree;
//Using if-else Statements
public class Program1 {
    public static void main(String[] args) {
        int a=30,b=15,c=45;
        if(a>b && a>c){
            System.out.println(a+" is maximum");
        }
        else if (b>c) {
            System.out.println(b+" is maximum");
        }
        else {
            System.out.println(c+" is maximum");
        }
    }
}
