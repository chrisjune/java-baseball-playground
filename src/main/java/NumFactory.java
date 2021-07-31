public class NumFactory {

    public static Num of(String str) {
        if ("+".equals(str)) return new NumPlus();
        if ("-".equals(str)) return new NumMinus();
        if ("*".equals(str)) return new NumMultiply();
        return new NumDivide();
    }
}
