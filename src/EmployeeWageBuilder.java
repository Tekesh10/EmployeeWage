import java.util.Random;

public class EmployeeWageBuilder {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    final String companyName;
    final int wagePerHour;
    final int totalWorkingDaysPerMonth;
    final int totalWorkingHoursPerMonth;
    int totalEmployeeWage;
    public EmployeeWageBuilder(String companyName, int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHoursPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
        this.totalWorkingHoursPerMonth = totalWorkingHoursPerMonth;
    }
    public void calculateEmployeeWage() {
        int dayCount = 0;
        int workingHours;
        int totalEmployeeWorkHour = 0;
        while (dayCount < totalWorkingDaysPerMonth && totalEmployeeWorkHour <= totalWorkingHoursPerMonth) {
            dayCount++;
            Random ran = new Random();
            int attendance = ran.nextInt(3);
            switch (attendance) {
                case FULL_TIME -> workingHours = 8;
                case PART_TIME -> workingHours = 4;
                default -> workingHours = 0;
            }
            int wage = workingHours * wagePerHour;
            System.out.println("Day " + dayCount + " work hour => " + workingHours + " and wage => " + wage);
            totalEmployeeWorkHour += workingHours;
        }
        totalEmployeeWage = totalEmployeeWorkHour * wagePerHour;
    }
    @Override
    public String toString() {
        return "Total Employee Wage for " + companyName+ " is => " + totalEmployeeWage;
    }
    public static void main(String[] args) {
        EmployeeWageBuilder company_one = new EmployeeWageBuilder("Company One",20,20,100);
        EmployeeWageBuilder company_two = new EmployeeWageBuilder("Company Two",25,22,120);
        EmployeeWageBuilder company_three = new EmployeeWageBuilder("Company Three",30,26,150);
        company_one.calculateEmployeeWage();
        System.out.println(company_one);
        System.out.println("-----------------------------------------------------------------");
        company_two.calculateEmployeeWage();
        System.out.println(company_two);
        System.out.println("-----------------------------------------------------------------");
        company_three.calculateEmployeeWage();
        System.out.println(company_three);
        System.out.println("-----------------------------------------------------------------");
    }
}
