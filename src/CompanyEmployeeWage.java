interface InterfaceCalculateEmployeeWage {
    void companyEmployeeWages(String companyName, int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHoursPerMonth);
    void calculateEmployeeWage();
    int getTotalWage(String companyName);
}
public class CompanyEmployeeWage {
    public final String companyName;
    public final int wagePerHour;
    public final int totalWorkingDaysPerMonth;
    public final int totalWorkingHoursPerMonth;
    public int totalEmployeeWage;
    public CompanyEmployeeWage(String companyName, int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHoursPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
        this.totalWorkingHoursPerMonth = totalWorkingHoursPerMonth;
        totalEmployeeWage = 0;
    }
    public void setTotalEmployeeWage(int totalEmployeeWage){
        this.totalEmployeeWage = totalEmployeeWage;
    }
    @Override
    public String toString() {
        return "Total Employee Wage for " + companyName + " is => " + totalEmployeeWage;
    }
}