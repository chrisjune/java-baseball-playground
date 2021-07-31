package string_calculator;

public class Calculator {

    private Num operator;

    public Calculator() {
        this.operator = NumFactory.of("+");
    }

    public int calculate(int total, String str) {
        try {
            return this.operator.operate(total, Integer.parseInt(str));
        } catch (NumberFormatException e) {
            this.operator = NumFactory.of(str);
            return total;
        }
    }
}
