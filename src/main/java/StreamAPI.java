import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        String fullName = "Nilesh";
        char[] nameArray = fullName.toCharArray();
        String[] fullNames = {"Tulja", "Supriya", "Nilesh"};

        fullName
                .chars()
                .mapToObj(a -> (char) a)
                .filter(a -> a.equals('i') || a.equals('h'))
                .forEach(System.out::println);

        IntStream
                .range(0, nameArray.length)
                .mapToObj(i -> nameArray[i])
                .forEach(System.out::println);

        Stream.of(fullNames)
                .filter(a -> a.equalsIgnoreCase("Tulja"))
                .forEach(System.out::println);
    }
}
