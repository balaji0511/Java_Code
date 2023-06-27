package MaximumOfTwo;
//Using inbuilt max Function
//In this method we’ll use the inbuilt max function to get the greatest of the two integer inputs.
public class Program3 {
    public static void main(String[] args) {
        int a=15,b=100;
        if(a==b){
            System.out.println("both are equal");
        }
        else{
            System.out.println(Math.max(a,b)+" is maximum");
        }
    }
}
