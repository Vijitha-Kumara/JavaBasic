import java.text.NumberFormat;

public class Format {
    public static void main(String[] args) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        String result = currencyFormat.format(154545454.44);
        String resultPercent = percentFormat.format(0.1);
        System.out.println(result);
        System.out.println(resultPercent);

    }
}
