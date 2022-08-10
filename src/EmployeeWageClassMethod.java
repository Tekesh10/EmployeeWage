import java.util.Random;

public class EmployeeWageClassMethod {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static void calculateEmployeeWage(String companyName, int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHoursPerMonth) {
        System.out.println("Welcome to "+companyName+" Wage Computation Program");
        Random ran = new Random();
        int dayCount = 0;
        int workingHours;
        int totalEmployeeWorkHour = 0;
        while (dayCount < totalWorkingDaysPerMonth && totalEmployeeWorkHour <= totalWorkingHoursPerMonth) {
            dayCount++;
            int attendance = ran.nextInt(3);
            switch (attendance) {
                case FULL_TIME -> workingHours = 8;
                case PART_TIME -> workingHours = 4;
                default -> workingHours = 0;
            }
            int wage = workingHours * wagePerHour;
            System.out.println("Day "+dayCount+" work hour => "+workingHours+" and wage => "+wage);
            totalEmployeeWorkHour += workingHours;
        }
        int totalEmployeeWage = totalEmployeeWorkHour * wagePerHour;
        System.out.println("Total Work Hour => "+totalEmployeeWorkHour);
        System.out.println("Total Employee Wage => "+totalEmployeeWage);
        System.out.println("------------------------------------------");
    }
    public static void main(String[] args) {
        calculateEmployeeWage("Company One",20,20,100);
        calculateEmployeeWage("Company Two",25,22,120);
        calculateEmployeeWage("Company Three",30,26,150);
    }
}
