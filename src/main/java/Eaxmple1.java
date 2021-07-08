import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Eaxmple1 {

    /**
     * Desc : This example will show how to print all elements using forEach with and without lambda
     *
     * @param args
     */
    public static void main(String[] args) {

        List<String> citiesLived = Arrays.asList("Pune", "London", "Dublin", "JoBerg", "KL", "Machester");

        // This will print all the element without lambda
        citiesLived.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("City lived in without lambda " + s);
            }
        });

        // This will print all the element with lambda
        citiesLived.forEach(s -> System.out.println("City lived in with lambda " + s));

        // This will print all the element with method reference. Please note in method reference parameter to lambda and method call is same
        citiesLived.forEach(System.out::println);


        // This will print all the element with method reference. Please note in method reference parameter to lambda and method call is same
        // With custom print
        citiesLived.forEach(Eaxmple1::customPrint);
    }

    public static void customPrint(String name) {
        System.out.println("Custom method : Citi i lived in is " + name);
    }
}
