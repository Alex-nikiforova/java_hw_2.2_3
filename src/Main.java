public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment12 = service.calculate(1_000_000, 12, (float) 0.0999);
        System.out.println(monthlyPayment12);
        int monthlyPayment24 = service.calculate(1_000_000, 24, (float) 0.0999);
        System.out.println(monthlyPayment24);
        int monthlyPayment36 = service.calculate(1_000_000, 36, (float) 0.0999);
        System.out.println(monthlyPayment36);
    }
}
