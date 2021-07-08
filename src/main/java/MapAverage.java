import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapAverage {
    public static void main(String[] args) {
        Map<String, Integer> person = new HashMap<>();
        person.put("a", 34);
        person.put("b", 34);
        person.put("c", 44);
        person.put("d", 14);
        person.put("e", 24);
        person.put("f", 14);


        System.out.println("Average of all ages is : " + person
                .entrySet()
                .stream()
                .peek(System.out::println)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList())
                .stream()
                .mapToInt(a -> a)
                .average());
    }
}
