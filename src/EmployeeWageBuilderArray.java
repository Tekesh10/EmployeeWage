import java.util.Random;

public class EmployeeWageBuilderArray {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    int numberOfCompany = 0;
    CompanyEmployeeWage[] companyEmployeeWagesArray;
    public EmployeeWageBuilderArray() {
        companyEmployeeWagesArray = new CompanyEmployeeWage[5];
    }
    void companyEmployeeWage(String companyName, int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHoursPerMonth) {
        companyEmployeeWagesArray[numberOfCompany] = new CompanyEmployeeWage(companyName,wagePerHour,totalWorkingDaysPerMonth,totalWorkingHoursPerMonth);
        numberOfCompany++;
    }
    void calculateEmployeeWage() {
        for (int i = 0; i < numberOfCompany; i++) {
            companyEmployeeWagesArray[i].setTotalEmployeeWage(this.calculateEmployeeWage(companyEmployeeWagesArray[i]));
            System.out.println(companyEmployeeWagesArray[i]);
            System.out.println("---------------------------------------------------");
        }
    }
    int calculateEmployeeWage(CompanyEmployeeWage companyEmployeeWage) {
        int dayCount = 0;
        int workingHours;
        int totalEmployeeWorkHour = 0;
        while (dayCount < companyEmployeeWage.totalWorkingDaysPerMonth && totalEmployeeWorkHour <= companyEmployeeWage.totalWorkingHoursPerMonth) {
            dayCount++;
            Random ran = new Random();
            int attendance = ran.nextInt(3);
            switch (attendance) {
                case FULL_TIME -> workingHours = 8;
                case PART_TIME -> workingHours = 4;
                default -> workingHours = 0;
            }
            System.out.println("Day " + dayCount + " work hour => " + workingHours);
            totalEmployeeWorkHour += workingHours;
        }
        return totalEmployeeWorkHour * companyEmployeeWage.wagePerHour;
    }
    public static void main(String[] args) {
        EmployeeWageBuilderArray employeeWageBuilder = new EmployeeWageBuilderArray();
        employeeWageBuilder.companyEmployeeWage("Company One",20,20,100);
        employeeWageBuilder.companyEmployeeWage("Company Two",25,22,120);
        employeeWageBuilder.companyEmployeeWage("Company Three",30,26,150);
        employeeWageBuilder.calculateEmployeeWage();
    }
}