import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {

    /**
     * Desc: This method will create another list for the given filter criteria
     * @param args
     */
    public static void main(String[] args){

        List<String> citiesLived = Arrays.asList("Pune","London", "Dublin", "JoBerg", "KL", "Machester");

        List<String> filteredCities = new ArrayList<>();

        citiesLived.stream().filter(city->city.startsWith("D")).forEach(filteredCities::add);
        System.out.println("Filtered cities list");
        filteredCities.forEach(System.out::println);

        // This method checks if any element in the list is Pune
        System.out.println("Pune Present " +  citiesLived.stream().anyMatch(city -> city.equals("Pune")));

        // Any method of stream that does not return a Stream object is terminal method

    }
}
