import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
public class EmployeeWageBuilderArray implements InterfaceCalculateEmployeeWage {
    LinkedList<CompanyEmployeeWage>companyEmployeeWageLinkedList;
    Map<String,CompanyEmployeeWage>companyEmployeeWageMap;
    public EmployeeWageBuilderArray() {
        companyEmployeeWageLinkedList = new LinkedList<>();
        companyEmployeeWageMap = new HashMap<>();
    }
    public void companyEmployeeWages(String companyName, int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHoursPerMonth) {
        CompanyEmployeeWage companyEmployeeWage  = new CompanyEmployeeWage(companyName,wagePerHour,totalWorkingDaysPerMonth,totalWorkingHoursPerMonth);
        companyEmployeeWageLinkedList.add(companyEmployeeWage);
        companyEmployeeWageMap.put(companyName,companyEmployeeWage);
    }
    public void calculateEmployeeWage() {
        for (CompanyEmployeeWage companyEmployeeWage : companyEmployeeWageLinkedList) {
            companyEmployeeWage.setTotalEmployeeWage(this.calculateEmployeeWage(companyEmployeeWage));
            System.out.println(companyEmployeeWage);
        }
    }
    @Override
    public int getTotalWage(String companyName) {
        return companyEmployeeWageMap.get(companyName).totalEmployeeWage;
    }
    public static void main(String[] args) {
        InterfaceCalculateEmployeeWage employeeWageBuilder = new EmployeeWageBuilderArray();
        employeeWageBuilder.companyEmployeeWages("Company One",20,20,100);
        employeeWageBuilder.companyEmployeeWages("Company Two",25,22,120);
        employeeWageBuilder.companyEmployeeWages("Company Three",30,26,150);
        employeeWageBuilder.calculateEmployeeWage();
    }
}