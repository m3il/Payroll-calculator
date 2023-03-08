import java.util.Scanner;
public class Payroll{
public static void main(String args[]){
    int hours;
    int wagePerHour;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter hours worked: ");
    hours = in.nextInt();
    System.out.println("Enter wage per hour: ");
    wagePerHour = in.nextInt();

    int wageTotal = wagePerHour * hours;
    System.out.println("Your total expected pay is: " + wageTotal);
    }
}
