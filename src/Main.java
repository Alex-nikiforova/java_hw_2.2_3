public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int MonthlyPayment12 = service.calculate(1_000_000, 12, (float) 0.0999);
        System.out.println(MonthlyPayment12);
        int MonthlyPayment24 = service.calculate(1_000_000, 24, (float) 0.0999);
        System.out.println(MonthlyPayment24);
        int MonthlyPayment36 = service.calculate(1_000_000, 36, (float) 0.0999);
        System.out.println(MonthlyPayment36);
    }
}
