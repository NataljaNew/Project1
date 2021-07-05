import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random() * (200 - 100+1) + 100));
        }
        List <String> result = list.stream()
                .filter((n) -> n % 2 == 0)
                .filter((n)-> n%5 == 0)
                .mapToDouble((double1)-> Math.sqrt(double1))
                .mapToObj((n) -> "Number _ " + n)
                .collect(Collectors.toList());

        for (String element : result){
            System.out.println(element);
        }
    }
}
