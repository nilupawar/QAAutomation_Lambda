import java.util.Arrays;
import java.util.List;

public class Example4 {

    /**
     * Desc: this example will help in understanding use of streams on some of common task on numbers
     * @param args
     */

    public static void main(String[] args) {
        int[] numbers = {4,1,2,4,6,7,8};

        System.out.println("Sum of all the numbers : " + Arrays.stream(numbers).sum());
        System.out.println("Max element in array : " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("min element in array : " + Arrays.stream(numbers).min().getAsInt());

        List<Employee> employees = Arrays.asList(new Employee(2300),new Employee(2400));

        int totalSalary = employees.parallelStream().mapToInt(employee -> employee.salary).sum();
        System.out.println("Total salary of the all employee is : " + totalSalary);

    }
}


class Employee{
    public int salary;
    public Employee(int salary){
        this.salary = salary;
    }
}