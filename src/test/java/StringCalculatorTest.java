import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @ParameterizedTest
    @CsvSource(value={
            "1 + 2,3",
            "2 + 3 * 4 / 2,10",
            "2 / 3 + 4 * 2,8"
    })
    void execute(String values, int result){
        StringCalculator stringCalculator = new StringCalculator();
        assertThat(stringCalculator.execute(values)).isEqualTo(result);
    }

}