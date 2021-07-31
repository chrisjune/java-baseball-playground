package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual[0]).contains("1");
        assertThat(actual[1]).contains("2");

        String[] actual2 = "1,".split(",");
        assertThat(actual2[0]).contains("1");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    void charAt() {
        String actual = "abc";
        assertThat(actual.charAt(0)).isEqualTo('a');
        assertThat(actual.charAt(1)).isEqualTo('b');
        assertThat(actual.charAt(2)).isEqualTo('c');

        assertThatThrownBy(() -> actual.charAt(4))
                .isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessage("String index out of range: 4");

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(()->{
                    actual.charAt(4);
                }).withMessageMatching("String index out of range: 4");

    }
}

