import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Example5 {
    public static void main(String[] args) throws IOException {
        int n = 2000;
        List<Integer> instances = Arrays.asList(10, 25, 50, 100, 500);
        List<Float> price = Arrays.asList(27.32f, 23.13f, 21.25f, 18.00f, 15.50f);

        price.forEach(p -> System.out.println(p));

        Optional<Integer> sameValue = instances.stream().filter(instance -> instance == n).findFirst();
        if (sameValue.isPresent()) {
            System.out.println(price.get(instances.indexOf(sameValue.get())).toString());
        }

        List<Integer> newInstances = new ArrayList<>(instances);
        if (n > instances.stream().mapToInt(Integer::intValue).max().getAsInt()) {
            Collections.sort(newInstances, Collections.reverseOrder());
        }


        int latestIn = instances.get(instances.size() - 1);
        int preIns = instances.get(instances.size() - 2);

        float latestPrice = price.get(price.size() - 1);
        float prePrice = price.get(price.size() - 2);

        System.out.println((latestPrice - prePrice));
        System.out.println(((n - preIns) / (double) (latestIn - preIns)) * (latestPrice - prePrice) + prePrice);

        DecimalFormat f = new DecimalFormat("##.000");
        System.out.println(f.format(((n - preIns) / (double) (latestIn - preIns)) * (latestPrice - prePrice) + prePrice));

        String.format("%.2f", ((n - preIns) / (double) (latestIn - preIns)) * (latestPrice - prePrice) + prePrice);


        //linear interpolation
        // y = new price
        // y0 = previous price
        // y1 = latest price
        // x0 = previous instacnce
        // x1 = latest instance

        float newprice = (prePrice * (latestIn - n) + latestPrice * (n - preIns)) / (latestIn - preIns);


        // linear extrapolation


        float newPrice = prePrice + ((n - preIns) / (latestIn - preIns)) * (latestPrice - prePrice);


    }
}
