package LeapYear;
//Conditions for Leap Year
//For any year to be a leap year the following two conditions must be checked. If the year satisfies either of the conditions, it's considered a leap year. Following are the conditions
//1. The year must be divisible by 400.
//2. The year must be divisible by 4 but not 100.
public class Program1 {
    public static void main(String[] args) {
        int year=2023;
        if(year%400==0){
            System.out.println("leap year-"+year);
        }
        else if (year%4==0 && year%100!=0){
            System.out.println("leap year-"+year);
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
