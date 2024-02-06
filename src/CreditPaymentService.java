public class CreditPaymentService {
    public int calculate(int amountCredit, int loanPeriod, double interestRate) {
        double payment;

        if (loanPeriod >= 6) {
            interestRate = interestRate / 12 / 100;
        }

        payment = amountCredit * (interestRate * Math.pow((1 + interestRate), loanPeriod) / (Math.pow((1 + interestRate), loanPeriod) - 1));
        return (int) payment;
    }
}
