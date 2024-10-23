public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        PaymentStrategy cryptoPayment = new CryptoPayment("0xAbC1234567EfG890123");

        ShoppingCart cart = new ShoppingCart(creditCardPayment);
        System.out.println("Using Credit Card:");
        cart.checkout(150.00);

        cart.changePaymentMethod(payPalPayment);
        System.out.println("\nUsing PayPal:");
        cart.checkout(250.00);

        cart.changePaymentMethod(cryptoPayment);
        System.out.println("\nUsing Cryptocurrency:");
        cart.checkout(300.00);
    }
}
