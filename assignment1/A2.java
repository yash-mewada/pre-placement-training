//WAP to check entered year is a leap year or not using nested if else
import java.util.Scanner;

class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = sc.nextInt();

        if(year == 0 || year < 0){
            System.out.print("enter a valid year");
        }
        else{
            if(year % 100 != 0){
                if(year % 4 == 0){
                    System.out.println("Leap year");
                }
                else {
                    System.out.println("Not a leap year");
                }
            } else {
                if(year % 400 == 0) {
                    System.out.print("Leap year");
                }
                else {
                    System.out.print("Not a leap year");
                }
            }  
        }      
    }
}
