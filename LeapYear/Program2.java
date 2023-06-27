package LeapYear;
//If the year variable is divisible by 400 or is it divisible by 4 but not 100.
//Print it’s a Leap Year if true, Print it’s not a Leap year otherwise.
public class Program2 {
    public static void main(String[] args) {
        int year=2024;
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
