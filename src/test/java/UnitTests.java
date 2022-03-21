import org.junit.Test;
import org.junit.jupiter.api.Order;

import static Solution.TaskConverter.converter;

public class UnitTests {

    @Test()
    public void testPositive() {
        System.out.println("Result:");
        System.out.println(converter("i"));
        System.out.println(converter("il"));
        System.out.println(converter("ily"));
        System.out.println(converter("ilya"));
        System.out.println(converter("ilya1"));
        System.out.println(converter("ilya23"));
        System.out.println(converter("ilya234"));
    }

    @Test()
    public void testNegativeNull() {
        System.out.println("Result with null:");
        System.out.println(converter(null));
    }

    @Test
    public void testNegativeEmpty() {
        System.out.println("Result with empty value '':");
        System.out.println(converter(""));
    }
}
