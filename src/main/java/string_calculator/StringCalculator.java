package string_calculator;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public List<String> split(String s) {
        return Arrays.asList(s.split(" "));
    }

    public int calculates(String s) {
        List<String> splitStringList = split(s);
        Calculator calculator = new Calculator();
        int total = 0;

        for (String str : splitStringList) {
            total = calculator.calculate(total, str);
        }
        return total;
    }
}
