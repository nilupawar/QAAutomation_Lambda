import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example2 {

    /**
     * Desc : Here we will cover printing all cities based on some conditions
     *
     * @param args
     */
    public static void main(String[] args) {

        List<String> citiesLived = Arrays.asList("Pune", "London", "Dublin", "JoBerg", "KL", "Machester");
        System.out.println("Cities that starts with P");
        printCities(citiesLived, s -> s.startsWith("P"));

        System.out.println("Cities that ends with r");
        printCities(citiesLived, s -> s.endsWith("r"));

    }

    public static void printCities(List<String> citiesLived, Predicate<String> predicate) {
        citiesLived.stream().filter(predicate).forEach(System.out::println);

    }
}
