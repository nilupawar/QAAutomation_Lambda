import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {

    /**
     * Desc: This method will create another list for the given filter criteria
     *
     * @param args
     */
    public static void main(String[] args) {

        List<String> citiesLived = Arrays.asList("Pune", "London", "Dublin", "JoBerg", "KL", "Machester");

        List<String> filteredCities = new ArrayList<>();

        citiesLived.stream().filter(city -> city.startsWith("D")).forEach(filteredCities::add);
        System.out.println("Filtered cities list");
        filteredCities.forEach(System.out::println);

        // This method checks if any element in the list is Pune
        System.out.println("Pune Present " + citiesLived.stream().anyMatch(city -> city.equals("Pune")));

        // Any method of stream that does not return a Stream object is terminal method

        int[] number = {1, 2, 3, 4, 3, 2, 1, 4, 56, 34, 67, 3, 56, 89, 43, 56, 7, 8, 9, 3, 4, 12};
        Arrays.stream(number).filter(value -> value > 15).map(value -> value * value).sum();

        filteredCities.stream()
                .collect(Collectors.toList());
    }
}
