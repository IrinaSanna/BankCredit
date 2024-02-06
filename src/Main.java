public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("1. Ежемесячный платеж: ");
        System.out.println(service.calculate(1_000_000, 12, 9.99));

        System.out.println("2. Ежемесячный платеж: ");
        System.out.println(service.calculate(1_000_000, 24, 9.99));

        System.out.println("3. Ежемесячный платеж: ");
        System.out.println(service.calculate(1_000_000, 36, 9.99));

    }
}