public class CreditPaymentService {
    public int calculate(int credit_amount, int loan_terms, float rate) {
        float monthly_percentage_rate = (float) (rate / 12);
        int monthly_payment = (int) (credit_amount * ((monthly_percentage_rate * (Math.pow(1 + monthly_percentage_rate, loan_terms))) / (Math.pow(1 + monthly_percentage_rate, loan_terms) - 1)));
        return monthly_payment;
    }
}
