import java.util.Random;

public class EmployeeWageClassMethod {
    public static final int PER_HOUR_WAGE = 20;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    static int Working_Day_per_Month = 20;
    static int Total_Working_Hour = 100;
    public static void calculateEmployeeWage() {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random ran = new Random();
        int dayCount = 0;
        int workingHours;
        int totalEmployeeWorkHour = 0;
        while (dayCount < Working_Day_per_Month && totalEmployeeWorkHour <= Total_Working_Hour) {
            dayCount++;
            int attendance = ran.nextInt(3);
            switch (attendance) {
                case FULL_TIME -> workingHours = 8;
                case PART_TIME -> workingHours = 4;
                default -> workingHours = 0;
            }
            int wage = workingHours * PER_HOUR_WAGE;
            System.out.println("Day "+dayCount+" work hour => "+workingHours+" and wage => "+wage);
            totalEmployeeWorkHour += workingHours;
        }
        int totalEmployeeWage = totalEmployeeWorkHour * PER_HOUR_WAGE;
        System.out.println("Total Work Hour => "+totalEmployeeWorkHour);
        System.out.println("Total Employee Wage => "+totalEmployeeWage);
    }
    public static void main(String[] args) {
        calculateEmployeeWage();
    }
}
