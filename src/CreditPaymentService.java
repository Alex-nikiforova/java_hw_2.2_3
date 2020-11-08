public class CreditPaymentService {
    public int calculate(int creditAmount, int loanTerms, float rate) {
        float monthlyRate = rate / 12;
        float coefficient = (float) ((monthlyRate * (Math.pow(1 + monthlyRate, loanTerms))) / (Math.pow(1 + monthlyRate, loanTerms) - 1));
        int monthlyPayment = (int) (creditAmount * coefficient);
        return monthlyPayment;
    }
}
