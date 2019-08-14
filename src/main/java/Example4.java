import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Example4 {

    /**
     * Desc: this example will help in understanding use of streams on some of common task on numbers
     * @param args
     */

    public static void main(String[] args){
        int[] numbers = {4,1,2,4,6,7,8};

        System.out.println("Sum of all the numbers : " + Arrays.stream(numbers).sum());
        System.out.println("Max element in array : " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("min element in array : " + Arrays.stream(numbers).min().getAsInt());


    }
}
