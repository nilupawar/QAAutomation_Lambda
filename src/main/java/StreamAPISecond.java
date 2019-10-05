import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPISecond {
    public static void main(String[] args) {

        String[] keyValues = {"Nilesh,98","Supriya,96","Tulja,91"};


        Arrays.stream(keyValues)
                .map(a -> a.split(","))
                .collect(Collectors.toMap(x->x[0],x->x[1]))
                .entrySet()
                .stream()
                .filter(e->e.getValue().equals("98"))
                .forEach(e-> System.out.println("Age is " + e.getKey()));
    }
}
