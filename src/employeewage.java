import java.util.Random;

public class employeewage {
    static int Wage_per_Hour = 20;
    static int Full_Day_Hour = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random ran = new Random();
        int attendance = ran.nextInt(2);

        if (attendance == 1) {
            System.out.println("Employee is Present");
            System.out.println("Employee`s Daily Wage is => " +Wage_per_Hour * Full_Day_Hour);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
