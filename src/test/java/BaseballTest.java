import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//425
class BaseballTest {
    @ParameterizedTest
    @CsvSource(value = {
            "671,낫싱",
            "132,1볼",
            "123,1스트라이크",
            "145,1볼 1스트라이크",
            "534,2볼",
            "524,2볼 1스트라이크",
            "425,3스트라이크",
    })
    void run(String input, String result){
        Baseball baseball = new Baseball();
        assertThat(baseball.run("425", input)).isEqualTo(result);
    }

}