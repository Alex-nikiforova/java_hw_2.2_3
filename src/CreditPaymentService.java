public class CreditPaymentService {
    public int calculate(int CreditAmount, int LoanTerms, float rate) {
        float MonthlyRate = rate / 12;
        float coefficient = (float) ((MonthlyRate * (Math.pow(1 + MonthlyRate, LoanTerms))) / (Math.pow(1 + MonthlyRate, LoanTerms) - 1));
        int MonthlyPayment = (int) (CreditAmount * coefficient);
        return MonthlyPayment;
    }
}
