public class CompanyEmployeeWage {
    final String companyName;
    final int wagePerHour;
    final int totalWorkingDaysPerMonth;
    final int totalWorkingHoursPerMonth;
    int totalEmployeeWage;
    public CompanyEmployeeWage(String companyName, int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHoursPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
        this.totalWorkingHoursPerMonth = totalWorkingHoursPerMonth;
    }
    public void setTotalEmployeeWage(int wagePerHour){
        this.totalEmployeeWage = wagePerHour;
    }
    @Override
    public String toString() {
        return "Total Employee Wage for " + companyName + " is => " + totalEmployeeWage;
    }
}