import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;

public class Example5 {
    public static void main(String[] args) throws IOException {
        List<String> fileLines = lines(get("D:\\Nilesh\\Read_Thoughts.txt")).collect(Collectors.toList());
        fileLines.forEach(System.out::println);

    }
}
