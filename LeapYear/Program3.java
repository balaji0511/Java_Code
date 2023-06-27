package LeapYear;
//Check if the year variable is divisible by 400 or divisible by 4 but not 100.
//If either of the above mentioned conditions are satisfied, print it’s a Leap Year. Print it’s not a Leap Year otherwise.
public class Program3 {
    public static void main(String[] args) {
        int year=2020;
        int flag;
        flag=(year%400==0 || (year%4==0 && year%100!=0))?1:0;
        if(flag==1){
            System.out.println(year+" Leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
