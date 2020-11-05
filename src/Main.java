public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthly_payment_12 = service.calculate(1_000_000, 12, (float) 0.0999);
        System.out.println(monthly_payment_12);
        int monthly_payment_24 = service.calculate(1_000_000, 24, (float) 0.0999);
        System.out.println(monthly_payment_24);
        int monthly_payment_36 = service.calculate(1_000_000, 36, (float) 0.0999);
        System.out.println(monthly_payment_36);
    }
}
