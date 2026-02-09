class Amazon {
    public static void main(String[] args) {
        makePayment("1234-5678-9876", 2500.50f);
    }

    static void makePayment(String cardNumber, Float amount) {
        System.out.println("Amazon Payment");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: " + amount);
    }
}
