import java.util.Scanner;

public class StringCalculator {
    int execute(String value) {
//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.nextLine();
        String[] values = value.split(" ");
        int result = 0;
        String operator = "+";
        for (String v : values) {
            try {
                int num = Integer.parseInt(v);
                if (operator.equals("+")) {
                    result += num;
                }
                if (operator.equals("-")) {
                    result -= num;
                }
                if (operator.equals("*")) {
                    result *= num;
                }
                if (operator.equals("/")) {
                    result /= num;
                }
            } catch (NumberFormatException e) {
                operator = v;
            }
        }
        return result;
    }
}
