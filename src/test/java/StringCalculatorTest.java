import org.junit.jupiter.api.Test;
import string_calculator.StringCalculator;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @Test
    void split(){
        assertThat(new StringCalculator().split("1 + 2")).isEqualTo(Arrays.asList("1","+","2"));
    }

    @Test
    void calculate(){
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.calculates("1")).isEqualTo(1);
        assertThat(calculator.calculates("1 + 2")).isEqualTo(3);
        assertThat(calculator.calculates("1 + 2 + 3")).isEqualTo(6);
        assertThat(calculator.calculates("1 - 2")).isEqualTo(-1);
        assertThat(calculator.calculates("1 * 2")).isEqualTo(2);
        assertThat(calculator.calculates("1 / 2")).isEqualTo(1/2);
        assertThat(calculator.calculates("1 + 2 * 3")).isEqualTo(9);
        assertThat(calculator.calculates("1 + 2 * 3 - 3 / 5")).isEqualTo(6/5);
    }
}
