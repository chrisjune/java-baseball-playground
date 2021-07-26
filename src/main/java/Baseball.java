import java.util.*;

public class Baseball {
    public static String run(String answer_str, String input_str) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            StrikeBall result = getStrikeBall(input_str.substring(i, i + 1),
                    answer_str.substring(i, i + 1),
                    answer_str);
            strike += result.getStrike();
            ball += result.getBall();
        }
        return getResultString(strike, ball);
    }

    private static class StrikeBall {
        private final int strike;
        private final int ball;

        public StrikeBall(int strike, int ball) {
            this.strike = strike;
            this.ball = ball;
        }

        public int getStrike() {
            return strike;
        }

        public int getBall() {
            return ball;
        }
    }

    static StrikeBall getStrikeBall(String i_s, String a_s, String answer_str) {
        if (i_s.equals(a_s)) {
            return new StrikeBall(1, 0);
        }
        if (answer_str.contains(i_s)) {
            return new StrikeBall(0, 1);
        }
        return new StrikeBall(0, 0);
    }

    private static String getResultString(int strike, int ball) {
        if (strike == 0 && ball == 0) return "낫싱";
        if (strike == 0) return String.format("%s볼", ball);
        if (ball == 0) return String.format("%s스트라이크", strike);
        return String.format("%s볼 %s스트라이크", ball, strike);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer_str = String.valueOf(randomThreeNumbers());
        while (true) {
            System.out.print("숫자를 입력해 주세요:");
            String value = scanner.nextLine();

            String result = run(answer_str, value);
            if (result.equals("3스트라이크")) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                String rerun_value = scanner.nextLine();
                if (rerun_value.equals("1")) {
                    answer_str = String.valueOf(randomThreeNumbers());
                    continue;
                }
                break;
            }
            System.out.println(result);


        }

    }

    static int randomThreeNumbers() {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(numberList);
        return numberList.get(0) * 100 + numberList.get(1) * 10 + numberList.get(2);
    }
}
