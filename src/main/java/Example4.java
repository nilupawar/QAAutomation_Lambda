import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Collections.*;

public class Example4 {

    /**
     * Desc: this example will help in understanding use of streams on some of common task on numbers
     * @param args
     */

    public static void main(String[] args) {
        int[] numbers = {4,1,2,4,6,7,8};

//        System.out.println("Sum of all the numbers : " + Arrays.stream(numbers).sum());
//        System.out.println("Max element in array : " + Arrays.stream(numbers).max().getAsInt());
//        System.out.println("min element in array : " + Arrays.stream(numbers).min().getAsInt());
//
        List<Employee> employees = emptyList();
        employees.stream()
                .max(Comparator.comparing(emp -> emp.salary));


        Stream.of(1, 4, 2, 6, 25)
                .sorted(Comparator.reverseOrder()).toArray();




//
//        if (employees.isEmpty()){
//            System.out.println("employees = ");
//        }
////                = Arrays.asList(new Employee(2300),new Employee(2400));
//
//        int totalSalary = employees.parallelStream().mapToInt(employee -> employee.salary).sum();
//        System.out.println("Total salary of the all employee is : " + totalSalary);
//
//        employees.stream().max(Comparator.comparing(emp->emp.salary)).ifPresent(new Consumer<Employee>() {
//            @Override
//            public void accept(Employee employee) {
//
//            }
//        });
//
//        employees.stream()
//                .max(Comparator.comparing(emp->emp.salary))
//                .get();

        System.out.println(Stream.of("this is the value of the","sdfsd sdfsdf sdfsdf")
                .map(str -> str.split("\\s+"))
                .flatMap(Stream::of)
                .distinct()
                .count());



    }


}


class Employee{
    public int salary;
    public Employee(int salary){
        this.salary = salary;
    }
}