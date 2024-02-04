public class CreditPaymentService {
    public int calculate(int amountCredit, int loanPeriod, double interestRate) {
        double payment;

        if (loanPeriod >= 12) {
            interestRate = 9.99 / 12 / 100;
        }
        payment = amountCredit * (interestRate * Math.pow((1 + interestRate), loanPeriod) / (Math.pow((1 + interestRate), loanPeriod) - 1));
        return (int) payment;
    }
}
