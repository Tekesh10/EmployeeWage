import java.util.Random;

public class employeewage {
    static int Wage_per_Hour = 20;
    static int Full_Day_Hour = 8;
    static int Part_Time_Hour = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random ran = new Random();
        int attendance = ran.nextInt(3);

        if (attendance == 1) {
            System.out.println("Employee is Present");
            System.out.println("Employee is Full time");
            System.out.println("Employee`s Daily Wage is => " + Wage_per_Hour * Full_Day_Hour);

        } else if (attendance == 2) {
            System.out.println("Employee is Present");
            System.out.println("Employee is Part time");
            System.out.println("Employee`s Daily Wage is => " + Wage_per_Hour * Part_Time_Hour);

        } else {
            System.out.println("Employee is Absent");
        }
    }
}
