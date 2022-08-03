import java.util.Random;

public class employeewage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random ran = new Random();
        int attendance = ran.nextInt(2);
        {
            if (attendance == 1)
                System.out.println("Employee is Present");
            else
                System.out.println("Employee is Absent");
        }
    }
}
