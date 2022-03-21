package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("q");

        list.stream().sorted().distinct().forEach(System.out::println);
        list.stream().distinct().forEach(x -> System.out.println("value " + x));

    }
}
