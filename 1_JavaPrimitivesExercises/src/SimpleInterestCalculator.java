import java.math.BigDecimal;

public class SimpleInterestCalculator {
    BigDecimal principal;
    BigDecimal interest;

    public SimpleInterestCalculator(String p, String i) {
        this.principal = new BigDecimal(p);
        this.interest = new BigDecimal(i).divide(new BigDecimal("100"));
    }

    public BigDecimal calculateTotalValue(int years) {
        return this.principal.add((this.principal.multiply(this.interest)).multiply(new BigDecimal(years)));
    }

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
