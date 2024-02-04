public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита 1 млн. рублей.");

        System.out.println("1. Кредит на 1 год. Ежемесячный платеж: ");
        System.out.println(service.calculate(1_000_000, 12, 9.99));

        System.out.println("2. Кредит на 2 года. Ежемесячный платеж: ");
        System.out.println(service.calculate(1_000_000, 24, 9.99));

        System.out.println("3. Кредит на 3 года. Ежемесячный платеж: ");
        System.out.println(service.calculate(1_000_000, 36, 9.99));

    }
}